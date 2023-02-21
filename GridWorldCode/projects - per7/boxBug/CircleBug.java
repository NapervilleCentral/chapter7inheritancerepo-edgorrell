
import info.gridworld.actor.Bug;
/**
 * Write a description of class CircleBug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
        steps = 0;
        sideLength = length;
    }
    
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
            
        }
        
        
    }

    
}







