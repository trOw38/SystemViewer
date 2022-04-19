B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=2.2
@EndOfDesignText@
'DiskUtils V1.1 by JM November 2014
Sub Process_Globals
	Private fx As JFX
	Private DiskStatusChange As Timer 
	Private OldDiskStatus As List
	Private caller As Object 
End Sub

'Initializes Events if you need them
'Events will be handled in the caller module
'caller module will have to include subs DisksAdded_Event and DisksRemoved_Event wich will handle the events
'Example
'DiskUtils.InitializeEvents (Me,5000)
'Will check for drives every 5 seconds
Sub InitializeEvents (module As Object,frequency As Int )
	caller=module
	OldDiskStatus.Initialize
	OldDiskStatus=GetDrives
	If DiskStatusChange.IsInitialized=False Then
		DiskStatusChange.Initialize ("DiskChange",frequency)
	End If
	DiskStatusChange.Enabled=True
End Sub

Sub TerminateEvents
	DiskStatusChange.Enabled=False
End Sub



'Returns a list with all available drives in the system
Sub GetDrives As List 
	Private lTotalDrives As List
	lTotalDrives.Initialize
	Private JObj1 As JavaObject 
	JObj1.InitializeStatic("java.io.File")
	JObj1 = JObj1.RunMethod("listRoots",Null)
	Private Drives() As Object
	Drives = JObj1
	For i = 0 To Drives.Length-1
		lTotalDrives.Add(Drives(i))
	Next
	Return lTotalDrives
End Sub


' Returns a Map with the following format (mapKey=driveLeter,value=Total Space of the drive in BYTES)
Sub GetDrivesCapacity As Map
	Private mTotalDriveCapacity As Map
	mTotalDriveCapacity.Initialize
	Private JObj1,JObj2 As JavaObject
	JObj1.InitializeStatic("java.io.File")
	JObj1 = JObj1.RunMethod("listRoots",Null)
	Private Drives() As Object
	Drives = JObj1
	For i = 0 To Drives.Length-1
		Dim a As String
		a=Drives(i)
		JObj2.InitializeNewInstance("java.io.File",Array As Object (a))
		JObj2=JObj2.RunMethod("getTotalSpace",Null)
		mTotalDriveCapacity.Put(Drives(i),JObj2)
	Next
	Return mTotalDriveCapacity

End Sub


' returns a Map with the following format (mapKey=driveLeter,value=Total Usable Space of the drive in BYTES)
Sub GetUsableSpace As Map
	Private mUsableSpace As Map
	mUsableSpace.Initialize
	Private JObj1,JObj2 As JavaObject
	JObj1.InitializeStatic("java.io.File")
	JObj1 = JObj1.RunMethod("listRoots",Null)
	Private Drives() As Object
	Drives = JObj1
	For i = 0 To Drives.Length-1
		Dim a As String
		a=Drives(i)
		JObj2.InitializeNewInstance("java.io.File",Array As Object (a))
		JObj2=JObj2.RunMethod("getUsableSpace",Null)
		mUsableSpace.Put(Drives(i),JObj2)
	Next
	Return mUsableSpace
End Sub

' Returns a Map with the following format (mapKey=driveLeter,value=Total Free Space of the drive in BYTES)
Sub GetFreeSpace As Map
	Private mFreeSpace As Map
	mFreeSpace.Initialize
	Private JObj1,JObj2 As JavaObject
	JObj1.InitializeStatic("java.io.File")
	JObj1 = JObj1.RunMethod("listRoots",Null)
	Private Drives() As Object
	Drives = JObj1
	For i = 0 To Drives.Length-1
		Dim a As String
		a=Drives(i)
		JObj2.InitializeNewInstance("java.io.File",Array As Object (a))
		JObj2=JObj2.RunMethod("getFreeSpace",Null)
		mFreeSpace.Put(Drives(i),JObj2)
	Next	
	Return mFreeSpace
End Sub

' Returns a Map with the following format (mapKey=driveLeter,value=True or False indicating if drive is writable)
Sub Writable As Map
	Private mCanWrite As Map
	mCanWrite.Initialize
	Private JObj1,JObj2 As JavaObject
	JObj1.InitializeStatic("java.io.File")
	JObj1 = JObj1.RunMethod("listRoots",Null)
	Private Drives() As Object
	Drives = JObj1
	For i = 0 To Drives.Length-1
		Dim a As String
		a=Drives(i)
		JObj2.InitializeNewInstance("java.io.File",Array As Object (a))
		JObj2=JObj2.RunMethod("canWrite",Null)
		mCanWrite.Put(Drives(i),JObj2)
	Next
	Return mCanWrite

End Sub

' Returns a Map with the following format (mapKey=driveLeter,value=Used Space of the drive in BYTES)
Sub GetUsedSpace As Map
	Private mUsedSpace As Map
	mUsedSpace.Initialize
	Private drivesTotal As Map
	drivesTotal.Initialize
	drivesTotal=GetDrivesCapacity
	Private DrivesFree As Map
	DrivesFree.Initialize
	DrivesFree=GetFreeSpace
	For f=0 To drivesTotal.Size-1
	Dim a,b,c As Long
	a=drivesTotal.GetValueAt(f)
	b=DrivesFree.GetValueAt(f)
	c=a-b
		mUsedSpace.Put(drivesTotal.GetKeyAt(f),c)
	Next	
	Return mUsedSpace	
End Sub

'not to be called directly. Timer will handle this sub. Generates the Events
Private Sub DiskChange_tick
	DiskStatusChange.Enabled=False
	Private NewDiskStatus As List
	NewDiskStatus.Initialize
	NewDiskStatus=GetDrives
	
	If NewDiskStatus.Size<>OldDiskStatus.Size Then
		'newdrives detected
		If NewDiskStatus.Size>OldDiskStatus.Size Then
			'disks added
			CallSub (caller,"DisksAdded_Event")
		Else
			'disksremoved
			CallSub (caller,"DisksRemoved_Event")
		End If
	End If
		'No Change in Disks
	OldDiskStatus=GetDrives
	DiskStatusChange.Enabled=True

End Sub






