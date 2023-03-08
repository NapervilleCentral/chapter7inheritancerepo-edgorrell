import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.*;

public class CircleBug extends Bug{
    Location init, loc, next;
    double x,y,r,theta;
    boolean first = true;
    
    public CircleBug(int radius){
        this.init = this.getLocation();
        this.r = radius;
        this.theta = 0;
    }
    
    @Override
    public void act(){
        if(first){
            this.init = this.getLocation();
            first = false;
            return;
        }
        Grid grid = this.getGrid();
        this.x = r*Math.cos(theta);
        this.y = r*Math.sin(theta);
        
        loc = this.getLocation();
        next = new Location((int)(init.getCol()+x),(int)(init.getRow()+y));
        this.moveTo(next);
        Flower flower = new Flower(this.getColor());
        flower.putSelfInGrid(grid, loc);
        
        this.theta += (2/10)*Math.PI;
        this.theta %= 2*Math.PI;
    }
}