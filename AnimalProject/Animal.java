public abstract class Animal{
    protected String type;
    protected boolean poisoned;

    public Animal(){
        type = "Default";
    }

    /**-----------------------------------------------------------------
     *  Creates a Animal with the given type.
     */
    public Animal(String animalType){
        type = animalType;
    }

    /**-----------------------------------------------------------------
     *  Returns this Animals type.
    /*/
    public String getType(){
        return type;
    }

    /**-----------------------------------------------------------------
     * This method should return a string indicating how this pet moves.
    /*/
    abstract public String move();

    /**-----------------------------------------------------------------
     * Returns a string representation of this Animal.
    /*/
    public String toString(){
        return this.type + ": \n";
    }
}







