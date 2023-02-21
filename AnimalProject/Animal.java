//********************************************************************
//  Animal.java       Author: Kevin/Terrific/Hayes
//
//  Represents an Animal.
//********************************************************************

public  abstract class Animal
{
   private String type;
   

    public Animal()
    {//this is called by default
        type = "Default";
        
        System.out.println("hello from Animal Default"  );
    }
   /**-----------------------------------------------------------------
   *  Creates a Animal with the given type.
   */
   public Animal(String animalType)
   {
      type = animalType;
      
      System.out.println("hello from Animal");
   }

   /**-----------------------------------------------------------------
   *  Returns this Animals type.
   /*/
   public String getType()
   {
      return type;
   }

    /**-----------------------------------------------------------------
    * This method should return a string indicating how this pet moves.
   /*/
   abstract public String move();



   /**-----------------------------------------------------------------
   * Returns a string representation of this Animal.
   /*/
   public String toString()
   {
      String data = "My type is " + type;
      
        
      return data;  
        
        
        
   }


}














