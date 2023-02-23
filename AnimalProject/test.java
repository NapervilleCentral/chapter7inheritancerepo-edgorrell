import javax.swing.*;
import java.awt.*;

public class test{
    public static void main(){
        try{
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice[] gs = ge.getScreenDevices();
            GraphicsDevice gd = gs[0];
            GraphicsConfiguration gc = gd.getConfigurations()[0];
            Rectangle bounds = gc.getBounds();
            
            //System.out.println(MouseInfo.getPointerInfo().getLocation());
            Robot r = new Robot(gd);
            while(true){
                if(Math.random() < 0.00001){
                    break;
                }
                r.mouseMove((int)(bounds.width*Math.random()),
                            (int)(bounds.height*Math.random()));
            }
        } catch(Exception e){}
    }
    public static class Events{
        public Events(){
            
        }
    }
}