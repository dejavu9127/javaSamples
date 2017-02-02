// getCodeBase() ,  getDocumentBase() and applet tag attributes
import java.awt.*;
import java.applet.*;
import java.net.*;  // URL
/*
<applet code="Bases"   width=300 height=150 >
</applet>


*/
public class Bases extends Applet{
// Display code and document bases.
public void paint(Graphics g) {
String msg;
URL url = getCodeBase(); // get code base , location of .class file
msg = "Code base: " + url.toString();
g.drawString(msg, 10, 60);
url = getDocumentBase(); // get document base, location of .html or .java file
msg = "Document base: " + url.toString();
g.drawString(msg, 10, 90);
}
}
//D:\test>appletviewer basehtml.html
