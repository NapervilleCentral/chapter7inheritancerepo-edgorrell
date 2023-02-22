public abstract class Reptile extends Animal{
    private String species;
    private int numberOfLegs;

    public Reptile(){
        super("Reptile");
        numberOfLegs = 0;
    }
    
    Reptile(String species, int numLegs){
        super("Reptile");
        this.species = species;
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
        String data = super.toString();
        return data;
    }
}