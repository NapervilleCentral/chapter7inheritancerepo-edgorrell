import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.*;


public class ZBug extends Bug{
    private int line, size, step;
    
    public ZBug(int size){
        super(new Color(0,255,0));
        this.size = size;
        this.step = 0;
        this.line = 0;
    }
    
    @Override
    public void act(){
        if(line > 2){
            return;
        }
        Grid grid = this.getGrid();
        Location next, loc = this.getLocation();
        if(this.line != 1){
            this.setDirection(Location.EAST);
        } else {
            this.setDirection(Location.SOUTHWEST);
        }
        next = loc.getAdjacentLocation(this.getDirection());
        if(this.getGrid().getOccupiedLocations().contains(next)){
            return;
        }
        this.moveTo(next);
        Flower flower = new Flower(this.getColor());
        flower.putSelfInGrid(grid, loc);
        step++;
        if(step == size){
            step = 0;
            line++;
        }
    }
}