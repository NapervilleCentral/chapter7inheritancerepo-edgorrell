
/**
 * Write a description of class Lab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lab extends Dog
{
    //from Pet we get the name - Protected
    //from Dog we get the weight - Private
    
    private String color;

    /**
     * Constructor for objects of class Lab
     */
    public Lab(int DogWeight, String LabColor, String DogName)
    {
        
        // initialise instance variables
        super(DogName, DogWeight);
        color = LabColor;
        
    }
    public String toString()
    {
        retrun (super.toString() + "and is a "+ color + " labrador");
    }

}
