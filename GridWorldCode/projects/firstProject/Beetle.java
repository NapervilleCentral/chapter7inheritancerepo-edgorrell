import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.*;

public class Beetle extends Bug{
    Color c;
    int size, turn = -1;
    
    public Beetle(){
        super(Color.RED);
    }
    
    @Override
    public void act(){
        if(turn == -1){
            this.moveTo(new Location(0,0));
            turn = 0;
        }
        c = new Color((int)(255*Math.random()),
                      (int)(255*Math.random()),
                      (int)(255*Math.random()));
        this.setColor(c);
        this.move();
    }
    @Override
    public void move(){
        Grid grid = this.getGrid();
        if(this.turn == this.size){
            this.setDirection(this.getDirection() + Location.RIGHT);
            if(this.getDirection() == Location.EAST){
                size++;
            }
            turn = 0;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if(grid.isValid(next)){
            this.moveTo(next);
        } else {
            this.moveTo(new Location(0,0));
            this.setDirection(Location.NORTH);
            this.size = 0;
            this.turn = -1;
        }
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(grid, loc);
        turn++;
    }
    @Override
    public void turn(){
    }
}