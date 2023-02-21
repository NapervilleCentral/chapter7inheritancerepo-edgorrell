public abstract class Reptile extends Animal{
    private int numberOfLegs;

    public Reptile(){
        //call the default constructor of Animal
        //happens automatic
        //super();

        super("Reptile");
        type = "reptile"; // private data will cause error
        numberOfLegs = 0;
    }

    /**-----------------------------------------------------------------
     *  Creates a reptile with n Legs.
     */
    public Reptile(int numLegs){
        super("reptile");
        numberOfLegs = numLegs;
    }
    
    /**-----------------------------------------------------------------
     *  Returns this Reptiles number of Legs
    /*/
    public int getLegs(){
        return numberOfLegs;
    }
    
    /**-----------------------------------------------------------------
     * This method should return a string indicating how this Reptile moves.
    /*/
    public String move(){
        return "crawl";
    }
    
    /**-----------------------------------------------------------------
     * Returns a string representation of this Animal.
    /*/
    public String toString(){
        return super.toString() +
        "\nI have "+getLegs()+ " number of Legs";
    }
}