import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.*;

public class GBug extends Bug{
    public int line, size, step;
    
    public GBug(){
        super(new Color(0,0,255));
        this.line = 0;
        this.size = 0;
        this.step = 0;
    }
    
    @Override
    public void act(){
        if(line > 4){
            return;
        }
        Grid grid = this.getGrid();
        Location next, loc = this.getLocation();
        switch(line){
            case 0:
                this.setDirection(Location.WEST);
                this.size = 5;
                break;
            case 1:
                this.setDirection(Location.SOUTH);
                this.size = 7;
                break;
            case 2:
                this.setDirection(Location.EAST);
                this.size = 5;
                break;
            case 3:
                this.setDirection(Location.NORTH);
                this.size = 3;
                break;
            case 4:
                this.setDirection(Location.WEST);
                this.size = 2;
                break;
        }
        next = loc.getAdjacentLocation(this.getDirection());
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