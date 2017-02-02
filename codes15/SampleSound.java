import java.awt.*;
import java.applet.*;
import java.net.*;
/*
  <applet  code="SampleSound" width=250 height=200> 
  </applet> 
  */
public class SampleSound extends Applet
{  
	AudioClip soundFile1=null;  //java.applet ,Interface AudioClip
  URL b;
  Image img; //java.awt, Class Image

  // set the foreground and background colors.
  public void init() 
  {
    setBackground(Color.gray);
	b = getCodeBase(); // get the location as URL ( .class )

	img = getImage(b,"bd.jpg");
		//soundFile1 = getAudioClip(new URL("file:/d:/test"),"A.wav"); 
	soundFile1 = getAudioClip(getCodeBase(),"happy_bd.wav"); 
	soundFile1.play();   // loop()
  }  
  public void paint(Graphics g) 
  {
  	g.drawImage(img,40,20,this); //   ImageObserver
	/*
		boolean drawImage(Image img,
                                  int x,
                                  int y,
                                  ImageObserver observer) */

  }
}

