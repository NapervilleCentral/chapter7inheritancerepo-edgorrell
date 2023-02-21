
/**
 * Write a description of class CircleBug here.
 * 
 * @author (Mr. Hayes) 
 * @version (a version number or a date)
 */
import info.gridworld.actor.Bug;

public class CircleBug extends Bug
{
    // instance variables - replace the example below with your own
    private int steps;
    private int sideLength;

    /**
     * Constructor for objects of class CircleBug
     */
    public CircleBug(int length)
    {
        // initialise instance variables
        sideLength = length;
        steps = 0;
    }
    public void act()
    { 
        if (steps < sideLength && canMove())
        {
        move();
        steps++;
        }
        else
        {   turn();
            steps = 0;
        }
        
        
        
        
    }

    
    
}




