import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.*;
import java.awt.*;

public class DanceBug extends Bug{
    int[] moves;
    int index;
    
    public DanceBug(int[] moves){
        super(Color.BLACK);
        this.moves = moves;
        this.index = 0;
    }
    
    @Override
    public void act(){
        Grid grid = this.getGrid();
        Location next, loc = this.getLocation();
        
        this.setDirection(this.getDirection() + (45*moves[index]));
        next = loc.getAdjacentLocation(this.getDirection());
        this.moveTo(next);
        Flower flower = new Flower(this.getColor());
        flower.putSelfInGrid(grid, loc);
        while(Math.random() < 0.4){
            loc = this.getLocation();
            next = loc.getAdjacentLocation(this.getDirection());
            this.moveTo(next);
            flower = new Flower(this.getColor());
            flower.putSelfInGrid(grid, loc);
        }
        
        this.setColor(new Color((int)(255*Math.random()),(int)(255*Math.random()),(int)(255*Math.random())));
        index++;
        index %= moves.length;
    }
}