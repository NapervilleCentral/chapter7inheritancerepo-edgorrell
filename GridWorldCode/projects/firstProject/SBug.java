import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.*;

public class SBug extends Bug{
    int size, step = -1;
    
    public SBug(){
        super(new Color(255,0,0));
    }
    
    @Override
    public void act(){
        Grid grid = this.getGrid();
        if(this.step == this.size){
            this.setDirection(this.getDirection() + Location.RIGHT);
            if(this.getDirection() == Location.EAST || this.getDirection() == Location.WEST){
                size += 2;
            }
            step = 0;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if(grid.isValid(next)){
            this.moveTo(next);
        }
        Flower flower = new Flower(this.getColor());
        flower.putSelfInGrid(grid, loc);
        step++;
    }
}