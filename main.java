package system.viewer;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("system.viewer", "system.viewer.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "system.viewer.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public static String _name = "";
public static String _version = "";
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public static anywheresoftware.b4a.objects.collections.List _sysl = null;
public static String _os = "";
public static String _osarch = "";
public static String _userdir = "";
public static String _userhome = "";
public static String _appdata = "";
public static String _javaversion = "";
public static String _javadir = "";
public static String _filesep = "";
public static String _ram = "";
public static String _cpu = "";
public static String _hdd1 = "";
public static String _hdd2 = "";
public static String _freemem = "";
public static String _usedmem = "";
public static String _totalmem = "";
public static butt.droid.awtRobot.AWTRobot _rootsystem = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public static ir.padina.jUUID _hwid = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button2 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button3 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button4 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label3 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label4 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label5 = null;
public static anywheresoftware.b4j.objects.ProgressIndicatorWrapper.ProgressBarWrapper _statuscpu = null;
public static anywheresoftware.b4j.objects.ProgressIndicatorWrapper.ProgressBarWrapper _statusram = null;
public static anywheresoftware.b4a.objects.Timer _tim = null;
public static int _counter = 0;
public static anywheresoftware.b4j.objects.LabelWrapper _label6 = null;
public static anywheresoftware.b4j.objects.StatusBarWrapper _statushdd = null;
public static String _userdoc = "";
public static anywheresoftware.b4j.objects.Shell _shell = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _listview2 = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _imageview2 = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _imageview3 = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _nodp = null;
public static anywheresoftware.b4j.objects.SegmentedButtonWrapper _shutdownbutton = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _popimage = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _extrabutton = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane3 = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _checkbox1 = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _checkbox2 = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _checkbox3 = null;
public static system.viewer.diskutils _diskutils = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 55;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 56;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
 //BA.debugLineNum = 57;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 58;BA.debugLine="MainForm.Icon=fx.LoadImage(File.DirAssets,\"017.pn";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"017.png").getObject()));
 //BA.debugLineNum = 59;BA.debugLine="MainForm.Resizable=False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 60;BA.debugLine="MainForm.Title=Name&\"-\"&Version";
_mainform.setTitle(_name+"-"+_version);
 //BA.debugLineNum = 61;BA.debugLine="NodP.Initialize(\"NodP\")";
_nodp.Initialize(ba,"NodP");
 //BA.debugLineNum = 62;BA.debugLine="Label1.Text=Name&\" \"&Version";
_label1.setText(_name+" "+_version);
 //BA.debugLineNum = 63;BA.debugLine="xui.SetDataFolder(Name)";
_xui.SetDataFolder(_name);
 //BA.debugLineNum = 64;BA.debugLine="Sysl.Initialize";
_sysl.Initialize();
 //BA.debugLineNum = 65;BA.debugLine="tim.Initialize(\"tim\",1000)";
_tim.Initialize(ba,"tim",(long) (1000));
 //BA.debugLineNum = 66;BA.debugLine="node_ad";
_node_ad();
 //BA.debugLineNum = 67;BA.debugLine="sys_stat";
_sys_stat();
 //BA.debugLineNum = 68;BA.debugLine="sys_info";
_sys_info();
 //BA.debugLineNum = 69;BA.debugLine="os_detect";
_os_detect();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
int _res = 0;
 //BA.debugLineNum = 73;BA.debugLine="Sub Button1_Click";
 //BA.debugLineNum = 74;BA.debugLine="MainForm.RootPane.RemoveAllNodes";
_mainform.getRootPane().RemoveAllNodes();
 //BA.debugLineNum = 75;BA.debugLine="Dim res As Int";
_res = 0;
 //BA.debugLineNum = 76;BA.debugLine="res= fx.Msgbox2(MainForm,\"Programm beenden?\",Name";
_res = _fx.Msgbox2(_mainform,"Programm beenden?",_name,"Ja","","Nein",_fx.MSGBOX_CONFIRMATION);
 //BA.debugLineNum = 77;BA.debugLine="If res = fx.DialogResponse.POSITIVE Then";
if (_res==_fx.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 78;BA.debugLine="MainForm.Close";
_mainform.Close();
 }else {
 //BA.debugLineNum = 80;BA.debugLine="If res=fx.DialogResponse.NEGATIVE Then";
if (_res==_fx.DialogResponse.NEGATIVE) { 
 //BA.debugLineNum = 81;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
 //BA.debugLineNum = 82;BA.debugLine="node_ad";
_node_ad();
 //BA.debugLineNum = 83;BA.debugLine="sys_stat";
_sys_stat();
 //BA.debugLineNum = 84;BA.debugLine="sys_info";
_sys_info();
 //BA.debugLineNum = 85;BA.debugLine="os_detect";
_os_detect();
 };
 };
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Private Sub Button2_Click";
 //BA.debugLineNum = 247;BA.debugLine="shell.Initialize(\"shl\", \"explorer.exe\",  Array As";
_shell.Initialize("shl","explorer.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"C:\\ProgramData"}));
 //BA.debugLineNum = 249;BA.debugLine="shell.WorkingDirectory = \"C:\\Windows\\System32\\\"";
_shell.setWorkingDirectory("C:\\Windows\\System32\\");
 //BA.debugLineNum = 251;BA.debugLine="shell.Run(10000)";
_shell.Run(ba,(long) (10000));
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Private Sub Button3_Click";
 //BA.debugLineNum = 239;BA.debugLine="shell.Initialize(\"shl\", \"explorer.exe\",  Array As";
_shell.Initialize("shl","explorer.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_userdoc}));
 //BA.debugLineNum = 241;BA.debugLine="shell.WorkingDirectory = \"C:\\Windows\\System32\\\"";
_shell.setWorkingDirectory("C:\\Windows\\System32\\");
 //BA.debugLineNum = 243;BA.debugLine="shell.Run(10000)";
_shell.Run(ba,(long) (10000));
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public static String  _button4_click() throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Private Sub Button4_Click";
 //BA.debugLineNum = 227;BA.debugLine="MainForm.RootPane.RemoveNodeFromParent";
_mainform.getRootPane().RemoveNodeFromParent();
 //BA.debugLineNum = 229;BA.debugLine="If NodP.Visible=True Then";
if (_nodp.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 }else {
 //BA.debugLineNum = 232;BA.debugLine="Pane3.Visible=True";
_pane3.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 233;BA.debugLine="NodP.Visible=True";
_nodp.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox1_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Private Sub CheckBox1_CheckedChange(Checked As Boo";
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return "";
}
public static String  _checkbox2_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Private Sub CheckBox2_CheckedChange(Checked As Boo";
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return "";
}
public static String  _copy_files() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub copy_files";
 //BA.debugLineNum = 114;BA.debugLine="If File.Exists(UserDOc&\"/SystemViewer\",\"SystemVie";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_userdoc+"/SystemViewer","SystemViewer_legal.rtf")) { 
 //BA.debugLineNum = 115;BA.debugLine="LogDebug(\"Files Ready\")";
anywheresoftware.b4a.keywords.Common.LogDebug("Files Ready");
 }else {
 //BA.debugLineNum = 117;BA.debugLine="File.MakeDir(UserDOc,\"SystemVIewer\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_userdoc,"SystemVIewer");
 //BA.debugLineNum = 118;BA.debugLine="File.CopyAsync(File.DirAssets,\"SystemVIewer_leg";
anywheresoftware.b4a.keywords.Common.File.CopyAsync(ba,anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"SystemVIewer_legal.rtf",_userdoc+"/SystemViewer","SystemViewer_legal.rtf");
 //BA.debugLineNum = 119;BA.debugLine="LogDebug(\"Files Copied\")";
anywheresoftware.b4a.keywords.Common.LogDebug("Files Copied");
 };
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public static String  _extrabutton_click() throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Private Sub ExtraButton_Click";
 //BA.debugLineNum = 275;BA.debugLine="If NodP.Visible=True Then";
if (_nodp.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 276;BA.debugLine="NodP.Visible=False";
_nodp.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 277;BA.debugLine="Pane3.Visible=False";
_pane3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 278;BA.debugLine="MainForm.RootPane.SetAlphaAnimated(100,1)";
_mainform.getRootPane().SetAlphaAnimated((int) (100),1);
 };
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return "";
}
public static String  _finduserdocumentsfolder() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _fs = null;
 //BA.debugLineNum = 200;BA.debugLine="Sub FindUserDocumentsFolder As String";
 //BA.debugLineNum = 201;BA.debugLine="If os_detect = \"windows\" Then";
if ((_os_detect()).equals("windows")) { 
 //BA.debugLineNum = 202;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 203;BA.debugLine="Dim fs As JavaObject = jo.InitializeStatic(\"java";
_fs = new anywheresoftware.b4j.object.JavaObject();
_fs = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.InitializeStatic("javax.swing.filechooser.FileSystemView").RunMethod("getFileSystemView",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 204;BA.debugLine="Return fs.RunMethodJO(\"getDefaultDirectory\", Nul";
if (true) return BA.ObjectToString(_fs.RunMethodJO("getDefaultDirectory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 }else {
 //BA.debugLineNum = 206;BA.debugLine="Return GetSystemProperty(\"user.home\", \"\") & \"\\Do";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"\\Documents";
 };
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public static String  _formatfilesize(float _bytes) throws Exception{
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
 //BA.debugLineNum = 170;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
 //BA.debugLineNum = 171;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
 //BA.debugLineNum = 172;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
 //BA.debugLineNum = 173;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
 //BA.debugLineNum = 175;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
 //BA.debugLineNum = 176;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 177;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
 //BA.debugLineNum = 178;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
 //BA.debugLineNum = 179;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
 //BA.debugLineNum = 180;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
 //BA.debugLineNum = 181;BA.debugLine="Return NumberFormat(Si, 1, 1) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (1))+_unit[_i];
 };
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public static String  _hdd_stat() throws Exception{
anywheresoftware.b4a.objects.collections.Map _totaldrivecapacity = null;
anywheresoftware.b4a.objects.collections.Map _totalfreespace = null;
int _t = 0;
 //BA.debugLineNum = 210;BA.debugLine="Sub hdd_stat";
 //BA.debugLineNum = 212;BA.debugLine="Private TotalDriveCapacity As Map";
_totaldrivecapacity = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 213;BA.debugLine="TotalDriveCapacity.Initialize";
_totaldrivecapacity.Initialize();
 //BA.debugLineNum = 214;BA.debugLine="TotalDriveCapacity=DiskUtils.GetDrivesCapacity";
_totaldrivecapacity = _diskutils._getdrivescapacity /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 215;BA.debugLine="Private TotalFreeSpace As Map";
_totalfreespace = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 216;BA.debugLine="TotalFreeSpace.Initialize";
_totalfreespace.Initialize();
 //BA.debugLineNum = 217;BA.debugLine="TotalFreeSpace=DiskUtils.GetFreeSpace";
_totalfreespace = _diskutils._getfreespace /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 218;BA.debugLine="StatusHdd.Text=FormatFileSize(TotalFreeSpace.GetV";
_statushdd.setText(_formatfilesize((float)(BA.ObjectToNumber(_totalfreespace.GetValueAt((int) (0))))));
 //BA.debugLineNum = 219;BA.debugLine="For t = 0 To TotalDriveCapacity.Size-1";
{
final int step8 = 1;
final int limit8 = (int) (_totaldrivecapacity.getSize()-1);
_t = (int) (0) ;
for (;_t <= limit8 ;_t = _t + step8 ) {
 //BA.debugLineNum = 220;BA.debugLine="LogDebug(\"MAP KEY: \"&TotalDriveCapacity.GetVal";
anywheresoftware.b4a.keywords.Common.LogDebug("MAP KEY: "+BA.ObjectToString(_totaldrivecapacity.GetValueAt(_t)));
 //BA.debugLineNum = 221;BA.debugLine="ListView2.Items.Add(TotalDriveCapacity.GetKeyAt(";
_listview2.getItems().Add((Object)(BA.ObjectToString(_totaldrivecapacity.GetKeyAt(_t))+_formatfilesize((float)(BA.ObjectToNumber(_totaldrivecapacity.GetValueAt(_t))))+" | Free: "+_formatfilesize((float)(BA.ObjectToNumber(_totalfreespace.GetValueAt(_t))))));
 }
};
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return "";
}
public static String  _imageview2_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Sub ImageView2_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 265;BA.debugLine="Button4_Click";
_button4_click();
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public static void  _imageview3_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
ResumableSub_ImageView3_MouseClicked rsub = new ResumableSub_ImageView3_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_ImageView3_MouseClicked extends BA.ResumableSub {
public ResumableSub_ImageView3_MouseClicked(system.viewer.main parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
system.viewer.main parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _res = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 255;BA.debugLine="Pane3.Visible=True";
parent._pane3.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 256;BA.debugLine="Dim res As Object";
_res = new Object();
 //BA.debugLineNum = 257;BA.debugLine="res=xui.Msgbox2Async(\"Programm version: \"&Version";
_res = parent._xui.Msgbox2Async(ba,"Programm version: "+parent._version+anywheresoftware.b4a.keywords.Common.CRLF+""+anywheresoftware.b4a.keywords.Common.CRLF+"©2022 by D.Trojan &Sulomedia",parent._name+" Info:","","close","",(javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"008_128.png").getObject()));
 //BA.debugLineNum = 258;BA.debugLine="Wait for(res)MsgBox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, this, _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
 //BA.debugLineNum = 259;BA.debugLine="If Result=xui.DialogResponse_Cancel Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Cancel) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 260;BA.debugLine="Pane3.Visible=False";
parent._pane3.setVisible(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static String  _label_stat() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Sub label_stat";
 //BA.debugLineNum = 148;BA.debugLine="If StatusCpu.Progress > 0.57 Then";
if (_statuscpu.getProgress()>0.57) { 
 //BA.debugLineNum = 149;BA.debugLine="Label5.TextColor=fx.Colors.RGB(255,148,0)";
_label5.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (255),(int) (148),(int) (0))));
 }else {
 //BA.debugLineNum = 151;BA.debugLine="Label5.TextColor=fx.Colors.RGB(14,226,0)";
_label5.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (14),(int) (226),(int) (0))));
 };
 //BA.debugLineNum = 153;BA.debugLine="If StatusRam.Progress > 0.57 Then";
if (_statusram.getProgress()>0.57) { 
 //BA.debugLineNum = 154;BA.debugLine="Label6.TextColor=fx.Colors.RGB(255,148,0)";
_label6.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (255),(int) (148),(int) (0))));
 }else {
 //BA.debugLineNum = 156;BA.debugLine="Label6.TextColor=fx.Colors.RGB(14,226,0)";
_label6.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (14),(int) (226),(int) (0))));
 };
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public static String  _node_ad() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub node_ad";
 //BA.debugLineNum = 92;BA.debugLine="MainForm.RootPane.AddNode(NodP,150,50,350,350)";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_nodp.getObject()),150,50,350,350);
 //BA.debugLineNum = 93;BA.debugLine="NodP.LoadLayout(\"Layout2\")";
_nodp.LoadLayout(ba,"Layout2");
 //BA.debugLineNum = 94;BA.debugLine="NodP.Visible=False";
_nodp.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public static String  _os_detect() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub os_detect";
 //BA.debugLineNum = 187;BA.debugLine="Dim OS As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
 //BA.debugLineNum = 188;BA.debugLine="If OS.Contains(\"win\") Then";
if (_os.contains("win")) { 
 //BA.debugLineNum = 189;BA.debugLine="ImageView1.SetImage(fx.LoadImage(File.DirAssets,";
_imageview1.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pngegg.png").getObject()));
 }else if(_os.contains("mac")) { 
 //BA.debugLineNum = 192;BA.debugLine="ImageView1.SetImage(fx.LoadImage(File.DirAssets,";
_imageview1.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"mac_os.png").getObject()));
 }else {
 //BA.debugLineNum = 195;BA.debugLine="ImageView1.SetImage(fx.LoadImage(File.DirAssets,";
_imageview1.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"009.png").getObject()));
 };
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public static String  _popimage_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Private Sub PopImage_MouseClicked (EventData As Mo";
 //BA.debugLineNum = 270;BA.debugLine="fx.ShowExternalDocument(UserDOc&\"\\SystemViewer\\Sy";
_fx.ShowExternalDocument(_userdoc+"\\SystemViewer\\SystemViewer_legal.rtf");
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
diskutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 13;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 14;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 15;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Name As String=\"SystemViewer Lite\"";
_name = "SystemViewer Lite";
 //BA.debugLineNum = 17;BA.debugLine="Private Version As String=\"1.0.2\"";
_version = "1.0.2";
 //BA.debugLineNum = 18;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Sysl As List";
_sysl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 22;BA.debugLine="Private OS,OSarch,UserDir,UserHome,AppData,JavaVe";
_os = "";
_osarch = "";
_userdir = "";
_userhome = "";
_appdata = "";
_javaversion = "";
_javadir = "";
_filesep = "";
_ram = "";
_cpu = "";
_hdd1 = "";
_hdd2 = "";
_freemem = "";
_usedmem = "";
_totalmem = "";
 //BA.debugLineNum = 23;BA.debugLine="Private RootSystem As AWTRobot";
_rootsystem = new butt.droid.awtRobot.AWTRobot();
 //BA.debugLineNum = 24;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Hwid As jUUID";
_hwid = new ir.padina.jUUID();
 //BA.debugLineNum = 26;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private StatusCpu As ProgressBar";
_statuscpu = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper.ProgressBarWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private StatusRam As ProgressBar";
_statusram = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper.ProgressBarWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private tim As Timer";
_tim = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 35;BA.debugLine="Private counter As Int=0";
_counter = (int) (0);
 //BA.debugLineNum = 36;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private StatusHdd As StatusBar";
_statushdd = new anywheresoftware.b4j.objects.StatusBarWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private UserDOc As String";
_userdoc = "";
 //BA.debugLineNum = 39;BA.debugLine="Private shell As Shell";
_shell = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 40;BA.debugLine="Private ListView2 As ListView";
_listview2 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private ImageView2 As ImageView";
_imageview2 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private ImageView3 As ImageView";
_imageview3 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private NodP As Pane";
_nodp = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private ShutdownButton As SegmentedButton";
_shutdownbutton = new anywheresoftware.b4j.objects.SegmentedButtonWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private PopImage As ImageView";
_popimage = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private ExtraButton As Button";
_extrabutton = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private Pane3 As Pane";
_pane3 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private CheckBox1 As CheckBox";
_checkbox1 = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private CheckBox2 As CheckBox";
_checkbox2 = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private CheckBox3 As CheckBox";
_checkbox3 = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public static String  _sys_info() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub sys_info";
 //BA.debugLineNum = 98;BA.debugLine="OS=GetSystemProperty(\"os.name\", \"\")";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","");
 //BA.debugLineNum = 99;BA.debugLine="OSarch=GetSystemProperty(\"os.arch\", \"\")";
_osarch = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.arch","");
 //BA.debugLineNum = 101;BA.debugLine="UserDOc=FindUserDocumentsFolder";
_userdoc = _finduserdocumentsfolder();
 //BA.debugLineNum = 102;BA.debugLine="copy_files";
_copy_files();
 //BA.debugLineNum = 103;BA.debugLine="HDD1=Hwid.Get_HddID1";
_hdd1 = _hwid.Get_HddID1();
 //BA.debugLineNum = 104;BA.debugLine="Label3.Text=\"HDD ID: \"&HDD1";
_label3.setText("HDD ID: "+_hdd1);
 //BA.debugLineNum = 105;BA.debugLine="totalmem=FormatFileSize(RootSystem.SystemMemoryPh";
_totalmem = _formatfilesize((float) (_rootsystem.SystemMemoryPhysicalTotal()));
 //BA.debugLineNum = 106;BA.debugLine="FreeMem=FormatFileSize(RootSystem.SystemMemoryPhy";
_freemem = _formatfilesize((float) (_rootsystem.SystemMemoryPhysicalFree()));
 //BA.debugLineNum = 107;BA.debugLine="usedMem=RootSystem.SystemMemoryPhysicalTotal - Ro";
_usedmem = BA.NumberToString(_rootsystem.SystemMemoryPhysicalTotal()-_rootsystem.SystemMemoryPhysicalFree());
 //BA.debugLineNum = 108;BA.debugLine="ListView1.Items.Add(\"Name: \"&OS)";
_listview1.getItems().Add((Object)("Name: "+_os));
 //BA.debugLineNum = 109;BA.debugLine="ListView1.Items.Add(\"Architecture: \"&OSarch)";
_listview1.getItems().Add((Object)("Architecture: "+_osarch));
 //BA.debugLineNum = 110;BA.debugLine="hdd_stat";
_hdd_stat();
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public static String  _sys_stat() throws Exception{
double _cp = 0;
long _cpt = 0L;
long _mem = 0L;
long _memfree = 0L;
long _mm2 = 0L;
long _memst = 0L;
double _sz = 0;
long _total = 0L;
 //BA.debugLineNum = 123;BA.debugLine="Sub sys_stat";
 //BA.debugLineNum = 124;BA.debugLine="tim.Enabled=True";
_tim.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 125;BA.debugLine="Dim cp As Double=RootSystem.SystemCPULoad";
_cp = _rootsystem.SystemCPULoad();
 //BA.debugLineNum = 126;BA.debugLine="Dim cpt As Long=cp*100";
_cpt = (long) (_cp*100);
 //BA.debugLineNum = 127;BA.debugLine="StatusCpu.Progress=cp";
_statuscpu.setProgress(_cp);
 //BA.debugLineNum = 128;BA.debugLine="Label5.Text=\"CPU: \"&cpt&\"%\"";
_label5.setText("CPU: "+BA.NumberToString(_cpt)+"%");
 //BA.debugLineNum = 129;BA.debugLine="LogDebug(\"CPU load: \"&cpt&\"%\")";
anywheresoftware.b4a.keywords.Common.LogDebug("CPU load: "+BA.NumberToString(_cpt)+"%");
 //BA.debugLineNum = 130;BA.debugLine="Dim mem , memfree,mm2,memst As Long";
_mem = 0L;
_memfree = 0L;
_mm2 = 0L;
_memst = 0L;
 //BA.debugLineNum = 131;BA.debugLine="Dim sz As Double";
_sz = 0;
 //BA.debugLineNum = 132;BA.debugLine="mem=RootSystem.SystemMemoryPhysicalTotal";
_mem = _rootsystem.SystemMemoryPhysicalTotal();
 //BA.debugLineNum = 133;BA.debugLine="memfree=RootSystem.SystemMemoryPhysicalFree";
_memfree = _rootsystem.SystemMemoryPhysicalFree();
 //BA.debugLineNum = 134;BA.debugLine="mm2=mem-memfree";
_mm2 = (long) (_mem-_memfree);
 //BA.debugLineNum = 135;BA.debugLine="Dim total As Long";
_total = 0L;
 //BA.debugLineNum = 136;BA.debugLine="total= mem-memfree";
_total = (long) (_mem-_memfree);
 //BA.debugLineNum = 137;BA.debugLine="sz=total/mem";
_sz = _total/(double)_mem;
 //BA.debugLineNum = 138;BA.debugLine="memst=total/mem *100";
_memst = (long) (_total/(double)_mem*100);
 //BA.debugLineNum = 139;BA.debugLine="StatusRam.Progress= sz";
_statusram.setProgress(_sz);
 //BA.debugLineNum = 140;BA.debugLine="Label4.Text=\"Use: \"&FormatFileSize(mm2)&CRLF&\"Tot";
_label4.setText("Use: "+_formatfilesize((float) (_mm2))+anywheresoftware.b4a.keywords.Common.CRLF+"Total: "+_formatfilesize((float) (_mem)));
 //BA.debugLineNum = 141;BA.debugLine="Label6.Text=\"RAM: \"&memst&\"%\"";
_label6.setText("RAM: "+BA.NumberToString(_memst)+"%");
 //BA.debugLineNum = 142;BA.debugLine="label_stat";
_label_stat();
 //BA.debugLineNum = 143;BA.debugLine="LogDebug(\"RAM \"&memst&\"%\")";
anywheresoftware.b4a.keywords.Common.LogDebug("RAM "+BA.NumberToString(_memst)+"%");
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public static String  _tim_tick() throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Sub tim_Tick";
 //BA.debugLineNum = 161;BA.debugLine="counter=counter+1";
_counter = (int) (_counter+1);
 //BA.debugLineNum = 162;BA.debugLine="If counter = 1 Then";
if (_counter==1) { 
 //BA.debugLineNum = 163;BA.debugLine="tim.Enabled=False";
_tim.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 164;BA.debugLine="counter=0";
_counter = (int) (0);
 //BA.debugLineNum = 165;BA.debugLine="sys_stat";
_sys_stat();
 //BA.debugLineNum = 166;BA.debugLine="LogDebug(\"Stating\")";
anywheresoftware.b4a.keywords.Common.LogDebug("Stating");
 };
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
}
