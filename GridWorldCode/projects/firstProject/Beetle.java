import info.gridworld.actor.Bug;
import java.util.*;
import java.awt.*;

public class Beetle extends Bug{
    Color c;
    public Beetle(){
        super(Color.RED);
    }
    
    @Override
    public void act(){
        c = new Color((int)(255*Math.random()),
                      (int)(255*Math.random()),
                      (int)(255*Math.random()));
        this.setColor(c);
        super.act();
    }
}