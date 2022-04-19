package system.viewer;


import anywheresoftware.b4a.BA;

public class diskutils extends Object{
public static diskutils mostCurrent = new diskutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("system.viewer", "system.viewer.diskutils", null);
		ba.loadHtSubs(diskutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "system.viewer.diskutils", ba);
		}
	}
    public static Class<?> getObject() {
		return diskutils.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4a.objects.Timer _diskstatuschange = null;
public static anywheresoftware.b4a.objects.collections.List _olddiskstatus = null;
public static Object _caller = null;
public static system.viewer.main _main = null;
public static String  _diskchange_tick() throws Exception{
anywheresoftware.b4a.objects.collections.List _newdiskstatus = null;
 //BA.debugLineNum = 147;BA.debugLine="Private Sub DiskChange_tick";
 //BA.debugLineNum = 148;BA.debugLine="DiskStatusChange.Enabled=False";
_diskstatuschange.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 149;BA.debugLine="Private NewDiskStatus As List";
_newdiskstatus = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 150;BA.debugLine="NewDiskStatus.Initialize";
_newdiskstatus.Initialize();
 //BA.debugLineNum = 151;BA.debugLine="NewDiskStatus=GetDrives";
_newdiskstatus = _getdrives();
 //BA.debugLineNum = 153;BA.debugLine="If NewDiskStatus.Size<>OldDiskStatus.Size Then";
if (_newdiskstatus.getSize()!=_olddiskstatus.getSize()) { 
 //BA.debugLineNum = 155;BA.debugLine="If NewDiskStatus.Size>OldDiskStatus.Size Then";
if (_newdiskstatus.getSize()>_olddiskstatus.getSize()) { 
 //BA.debugLineNum = 157;BA.debugLine="CallSub (caller,\"DisksAdded_Event\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,_caller,"DisksAdded_Event");
 }else {
 //BA.debugLineNum = 160;BA.debugLine="CallSub (caller,\"DisksRemoved_Event\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(ba,_caller,"DisksRemoved_Event");
 };
 };
 //BA.debugLineNum = 164;BA.debugLine="OldDiskStatus=GetDrives";
_olddiskstatus = _getdrives();
 //BA.debugLineNum = 165;BA.debugLine="DiskStatusChange.Enabled=True";
_diskstatuschange.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getdrives() throws Exception{
anywheresoftware.b4a.objects.collections.List _ltotaldrives = null;
anywheresoftware.b4j.object.JavaObject _jobj1 = null;
Object[] _drives = null;
int _i = 0;
 //BA.debugLineNum = 32;BA.debugLine="Sub GetDrives As List";
 //BA.debugLineNum = 33;BA.debugLine="Private lTotalDrives As List";
_ltotaldrives = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 34;BA.debugLine="lTotalDrives.Initialize";
_ltotaldrives.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="Private JObj1 As JavaObject";
_jobj1 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 36;BA.debugLine="JObj1.InitializeStatic(\"java.io.File\")";
_jobj1.InitializeStatic("java.io.File");
 //BA.debugLineNum = 37;BA.debugLine="JObj1 = JObj1.RunMethod(\"listRoots\",Null)";
_jobj1 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jobj1.RunMethod("listRoots",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 38;BA.debugLine="Private Drives() As Object";
_drives = new Object[(int) (0)];
{
int d0 = _drives.length;
for (int i0 = 0;i0 < d0;i0++) {
_drives[i0] = new Object();
}
}
;
 //BA.debugLineNum = 39;BA.debugLine="Drives = JObj1";
_drives = (Object[])(_jobj1.getObject());
 //BA.debugLineNum = 40;BA.debugLine="For i = 0 To Drives.Length-1";
{
final int step8 = 1;
final int limit8 = (int) (_drives.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 41;BA.debugLine="lTotalDrives.Add(Drives(i))";
_ltotaldrives.Add(_drives[_i]);
 }
};
 //BA.debugLineNum = 43;BA.debugLine="Return lTotalDrives";
if (true) return _ltotaldrives;
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getdrivescapacity() throws Exception{
anywheresoftware.b4a.objects.collections.Map _mtotaldrivecapacity = null;
anywheresoftware.b4j.object.JavaObject _jobj1 = null;
anywheresoftware.b4j.object.JavaObject _jobj2 = null;
Object[] _drives = null;
int _i = 0;
String _a = "";
 //BA.debugLineNum = 48;BA.debugLine="Sub GetDrivesCapacity As Map";
 //BA.debugLineNum = 49;BA.debugLine="Private mTotalDriveCapacity As Map";
_mtotaldrivecapacity = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 50;BA.debugLine="mTotalDriveCapacity.Initialize";
_mtotaldrivecapacity.Initialize();
 //BA.debugLineNum = 51;BA.debugLine="Private JObj1,JObj2 As JavaObject";
_jobj1 = new anywheresoftware.b4j.object.JavaObject();
_jobj2 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 52;BA.debugLine="JObj1.InitializeStatic(\"java.io.File\")";
_jobj1.InitializeStatic("java.io.File");
 //BA.debugLineNum = 53;BA.debugLine="JObj1 = JObj1.RunMethod(\"listRoots\",Null)";
_jobj1 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jobj1.RunMethod("listRoots",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 54;BA.debugLine="Private Drives() As Object";
_drives = new Object[(int) (0)];
{
int d0 = _drives.length;
for (int i0 = 0;i0 < d0;i0++) {
_drives[i0] = new Object();
}
}
;
 //BA.debugLineNum = 55;BA.debugLine="Drives = JObj1";
_drives = (Object[])(_jobj1.getObject());
 //BA.debugLineNum = 56;BA.debugLine="For i = 0 To Drives.Length-1";
{
final int step8 = 1;
final int limit8 = (int) (_drives.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 57;BA.debugLine="Dim a As String";
_a = "";
 //BA.debugLineNum = 58;BA.debugLine="a=Drives(i)";
_a = BA.ObjectToString(_drives[_i]);
 //BA.debugLineNum = 59;BA.debugLine="JObj2.InitializeNewInstance(\"java.io.File\",Array";
_jobj2.InitializeNewInstance("java.io.File",new Object[]{(Object)(_a)});
 //BA.debugLineNum = 60;BA.debugLine="JObj2=JObj2.RunMethod(\"getTotalSpace\",Null)";
_jobj2 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jobj2.RunMethod("getTotalSpace",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 61;BA.debugLine="mTotalDriveCapacity.Put(Drives(i),JObj2)";
_mtotaldrivecapacity.Put(_drives[_i],(Object)(_jobj2.getObject()));
 }
};
 //BA.debugLineNum = 63;BA.debugLine="Return mTotalDriveCapacity";
if (true) return _mtotaldrivecapacity;
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getfreespace() throws Exception{
anywheresoftware.b4a.objects.collections.Map _mfreespace = null;
anywheresoftware.b4j.object.JavaObject _jobj1 = null;
anywheresoftware.b4j.object.JavaObject _jobj2 = null;
Object[] _drives = null;
int _i = 0;
String _a = "";
 //BA.debugLineNum = 88;BA.debugLine="Sub GetFreeSpace As Map";
 //BA.debugLineNum = 89;BA.debugLine="Private mFreeSpace As Map";
_mfreespace = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 90;BA.debugLine="mFreeSpace.Initialize";
_mfreespace.Initialize();
 //BA.debugLineNum = 91;BA.debugLine="Private JObj1,JObj2 As JavaObject";
_jobj1 = new anywheresoftware.b4j.object.JavaObject();
_jobj2 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 92;BA.debugLine="JObj1.InitializeStatic(\"java.io.File\")";
_jobj1.InitializeStatic("java.io.File");
 //BA.debugLineNum = 93;BA.debugLine="JObj1 = JObj1.RunMethod(\"listRoots\",Null)";
_jobj1 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jobj1.RunMethod("listRoots",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 94;BA.debugLine="Private Drives() As Object";
_drives = new Object[(int) (0)];
{
int d0 = _drives.length;
for (int i0 = 0;i0 < d0;i0++) {
_drives[i0] = new Object();
}
}
;
 //BA.debugLineNum = 95;BA.debugLine="Drives = JObj1";
_drives = (Object[])(_jobj1.getObject());
 //BA.debugLineNum = 96;BA.debugLine="For i = 0 To Drives.Length-1";
{
final int step8 = 1;
final int limit8 = (int) (_drives.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 97;BA.debugLine="Dim a As String";
_a = "";
 //BA.debugLineNum = 98;BA.debugLine="a=Drives(i)";
_a = BA.ObjectToString(_drives[_i]);
 //BA.debugLineNum = 99;BA.debugLine="JObj2.InitializeNewInstance(\"java.io.File\",Array";
_jobj2.InitializeNewInstance("java.io.File",new Object[]{(Object)(_a)});
 //BA.debugLineNum = 100;BA.debugLine="JObj2=JObj2.RunMethod(\"getFreeSpace\",Null)";
_jobj2 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jobj2.RunMethod("getFreeSpace",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 101;BA.debugLine="mFreeSpace.Put(Drives(i),JObj2)";
_mfreespace.Put(_drives[_i],(Object)(_jobj2.getObject()));
 }
};
 //BA.debugLineNum = 103;BA.debugLine="Return mFreeSpace";
if (true) return _mfreespace;
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getusablespace() throws Exception{
anywheresoftware.b4a.objects.collections.Map _musablespace = null;
anywheresoftware.b4j.object.JavaObject _jobj1 = null;
anywheresoftware.b4j.object.JavaObject _jobj2 = null;
Object[] _drives = null;
int _i = 0;
String _a = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub GetUsableSpace As Map";
 //BA.debugLineNum = 70;BA.debugLine="Private mUsableSpace As Map";
_musablespace = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 71;BA.debugLine="mUsableSpace.Initialize";
_musablespace.Initialize();
 //BA.debugLineNum = 72;BA.debugLine="Private JObj1,JObj2 As JavaObject";
_jobj1 = new anywheresoftware.b4j.object.JavaObject();
_jobj2 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 73;BA.debugLine="JObj1.InitializeStatic(\"java.io.File\")";
_jobj1.InitializeStatic("java.io.File");
 //BA.debugLineNum = 74;BA.debugLine="JObj1 = JObj1.RunMethod(\"listRoots\",Null)";
_jobj1 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jobj1.RunMethod("listRoots",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 75;BA.debugLine="Private Drives() As Object";
_drives = new Object[(int) (0)];
{
int d0 = _drives.length;
for (int i0 = 0;i0 < d0;i0++) {
_drives[i0] = new Object();
}
}
;
 //BA.debugLineNum = 76;BA.debugLine="Drives = JObj1";
_drives = (Object[])(_jobj1.getObject());
 //BA.debugLineNum = 77;BA.debugLine="For i = 0 To Drives.Length-1";
{
final int step8 = 1;
final int limit8 = (int) (_drives.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 78;BA.debugLine="Dim a As String";
_a = "";
 //BA.debugLineNum = 79;BA.debugLine="a=Drives(i)";
_a = BA.ObjectToString(_drives[_i]);
 //BA.debugLineNum = 80;BA.debugLine="JObj2.InitializeNewInstance(\"java.io.File\",Array";
_jobj2.InitializeNewInstance("java.io.File",new Object[]{(Object)(_a)});
 //BA.debugLineNum = 81;BA.debugLine="JObj2=JObj2.RunMethod(\"getUsableSpace\",Null)";
_jobj2 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jobj2.RunMethod("getUsableSpace",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 82;BA.debugLine="mUsableSpace.Put(Drives(i),JObj2)";
_musablespace.Put(_drives[_i],(Object)(_jobj2.getObject()));
 }
};
 //BA.debugLineNum = 84;BA.debugLine="Return mUsableSpace";
if (true) return _musablespace;
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getusedspace() throws Exception{
anywheresoftware.b4a.objects.collections.Map _musedspace = null;
anywheresoftware.b4a.objects.collections.Map _drivestotal = null;
anywheresoftware.b4a.objects.collections.Map _drivesfree = null;
int _f = 0;
long _a = 0L;
long _b = 0L;
long _c = 0L;
 //BA.debugLineNum = 127;BA.debugLine="Sub GetUsedSpace As Map";
 //BA.debugLineNum = 128;BA.debugLine="Private mUsedSpace As Map";
_musedspace = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 129;BA.debugLine="mUsedSpace.Initialize";
_musedspace.Initialize();
 //BA.debugLineNum = 130;BA.debugLine="Private drivesTotal As Map";
_drivestotal = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 131;BA.debugLine="drivesTotal.Initialize";
_drivestotal.Initialize();
 //BA.debugLineNum = 132;BA.debugLine="drivesTotal=GetDrivesCapacity";
_drivestotal = _getdrivescapacity();
 //BA.debugLineNum = 133;BA.debugLine="Private DrivesFree As Map";
_drivesfree = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 134;BA.debugLine="DrivesFree.Initialize";
_drivesfree.Initialize();
 //BA.debugLineNum = 135;BA.debugLine="DrivesFree=GetFreeSpace";
_drivesfree = _getfreespace();
 //BA.debugLineNum = 136;BA.debugLine="For f=0 To drivesTotal.Size-1";
{
final int step9 = 1;
final int limit9 = (int) (_drivestotal.getSize()-1);
_f = (int) (0) ;
for (;_f <= limit9 ;_f = _f + step9 ) {
 //BA.debugLineNum = 137;BA.debugLine="Dim a,b,c As Long";
_a = 0L;
_b = 0L;
_c = 0L;
 //BA.debugLineNum = 138;BA.debugLine="a=drivesTotal.GetValueAt(f)";
_a = BA.ObjectToLongNumber(_drivestotal.GetValueAt(_f));
 //BA.debugLineNum = 139;BA.debugLine="b=DrivesFree.GetValueAt(f)";
_b = BA.ObjectToLongNumber(_drivesfree.GetValueAt(_f));
 //BA.debugLineNum = 140;BA.debugLine="c=a-b";
_c = (long) (_a-_b);
 //BA.debugLineNum = 141;BA.debugLine="mUsedSpace.Put(drivesTotal.GetKeyAt(f),c)";
_musedspace.Put(_drivestotal.GetKeyAt(_f),(Object)(_c));
 }
};
 //BA.debugLineNum = 143;BA.debugLine="Return mUsedSpace";
if (true) return _musedspace;
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public static String  _initializeevents(Object _module,int _frequency) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub InitializeEvents (module As Object,frequency A";
 //BA.debugLineNum = 16;BA.debugLine="caller=module";
_caller = _module;
 //BA.debugLineNum = 17;BA.debugLine="OldDiskStatus.Initialize";
_olddiskstatus.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="OldDiskStatus=GetDrives";
_olddiskstatus = _getdrives();
 //BA.debugLineNum = 19;BA.debugLine="If DiskStatusChange.IsInitialized=False Then";
if (_diskstatuschange.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 20;BA.debugLine="DiskStatusChange.Initialize (\"DiskChange\",freque";
_diskstatuschange.Initialize(ba,"DiskChange",(long) (_frequency));
 };
 //BA.debugLineNum = 22;BA.debugLine="DiskStatusChange.Enabled=True";
_diskstatuschange.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private DiskStatusChange As Timer";
_diskstatuschange = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 5;BA.debugLine="Private OldDiskStatus As List";
_olddiskstatus = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private caller As Object";
_caller = new Object();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _terminateevents() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub TerminateEvents";
 //BA.debugLineNum = 26;BA.debugLine="DiskStatusChange.Enabled=False";
_diskstatuschange.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _writable() throws Exception{
anywheresoftware.b4a.objects.collections.Map _mcanwrite = null;
anywheresoftware.b4j.object.JavaObject _jobj1 = null;
anywheresoftware.b4j.object.JavaObject _jobj2 = null;
Object[] _drives = null;
int _i = 0;
String _a = "";
 //BA.debugLineNum = 107;BA.debugLine="Sub Writable As Map";
 //BA.debugLineNum = 108;BA.debugLine="Private mCanWrite As Map";
_mcanwrite = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 109;BA.debugLine="mCanWrite.Initialize";
_mcanwrite.Initialize();
 //BA.debugLineNum = 110;BA.debugLine="Private JObj1,JObj2 As JavaObject";
_jobj1 = new anywheresoftware.b4j.object.JavaObject();
_jobj2 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 111;BA.debugLine="JObj1.InitializeStatic(\"java.io.File\")";
_jobj1.InitializeStatic("java.io.File");
 //BA.debugLineNum = 112;BA.debugLine="JObj1 = JObj1.RunMethod(\"listRoots\",Null)";
_jobj1 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jobj1.RunMethod("listRoots",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 113;BA.debugLine="Private Drives() As Object";
_drives = new Object[(int) (0)];
{
int d0 = _drives.length;
for (int i0 = 0;i0 < d0;i0++) {
_drives[i0] = new Object();
}
}
;
 //BA.debugLineNum = 114;BA.debugLine="Drives = JObj1";
_drives = (Object[])(_jobj1.getObject());
 //BA.debugLineNum = 115;BA.debugLine="For i = 0 To Drives.Length-1";
{
final int step8 = 1;
final int limit8 = (int) (_drives.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 116;BA.debugLine="Dim a As String";
_a = "";
 //BA.debugLineNum = 117;BA.debugLine="a=Drives(i)";
_a = BA.ObjectToString(_drives[_i]);
 //BA.debugLineNum = 118;BA.debugLine="JObj2.InitializeNewInstance(\"java.io.File\",Array";
_jobj2.InitializeNewInstance("java.io.File",new Object[]{(Object)(_a)});
 //BA.debugLineNum = 119;BA.debugLine="JObj2=JObj2.RunMethod(\"canWrite\",Null)";
_jobj2 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jobj2.RunMethod("canWrite",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 120;BA.debugLine="mCanWrite.Put(Drives(i),JObj2)";
_mcanwrite.Put(_drives[_i],(Object)(_jobj2.getObject()));
 }
};
 //BA.debugLineNum = 122;BA.debugLine="Return mCanWrite";
if (true) return _mcanwrite;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
}
