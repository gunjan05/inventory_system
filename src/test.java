import java.awt.*;
import java.applet.*;

public class test extends Applet implements Runnable {
   String str = "This is a simple Banner ";
   Thread t ;

   
   public void init() {
      setBackground(Color.gray);
      setForeground(Color.yellow);
   }
   public void start() {
      t = new Thread(this);
    
      t.start();
   }
   public void run () {
      char ch;
      for( ; ; ) {
      try {
         repaint();
         Thread.sleep(250);
         ch = str.charAt(0);
         str = str.substring(1, str.length());
         str = str + ch;
      }
      catch(InterruptedException e) {}
      }
   }
   public void paint(Graphics g) {
      g.drawRect(1,1,300,150);
      g.setColor(Color.yellow);
      g.fillRect(1,1,300,150);
      g.setColor(Color.red);
      g.drawString(str, 1, 150);
   }
}
/*<applet code="SampleBanner.class" height =500 width=500></applet>*/
