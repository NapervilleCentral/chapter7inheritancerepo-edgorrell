import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test{
    public static Robot r;
    public static void main(String[] args){
        try{
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice[] gs = ge.getScreenDevices();
            GraphicsDevice gd = gs[0];
            GraphicsConfiguration gc = gd.getConfigurations()[0];
            Rectangle bounds = gc.getBounds();
            
            //System.out.println(MouseInfo.getPointerInfo().getLocation());
            r = new Robot(gd);
            char[] letters;
            
            type(KeyEvent.VK_WINDOWS);
            
            //type(r,KeyEvent.VK_ENTER);
        } catch(Exception e){}
    }
    public static void type(int keycode){
        try{
            r.keyPress(keycode);
            Thread.sleep(10);
            r.keyRelease(keycode);
        } catch(Exception e){}
    }
}
//