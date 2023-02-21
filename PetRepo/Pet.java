//********************************************************************
//  Pet.java       Author: Lewis/Loftus/Cocking
//
//  Represents a pet.
//********************************************************************

public abstract class Pet
{
   private String name;

	public Pet()
	{//this is called by default
		name = "Default";
		System.out.println("hello from Pet"  );
	}
   /**-----------------------------------------------------------------
   *  Creates a pet with the given name.
   */
   public Pet(String petName)
   {
      name = petName;
      //System.out.println("hello from Pet");
   }

   /**-----------------------------------------------------------------
   *  Returns this pet's name.
   /*/
   public String getName()
   {
      return name;
   }

   /**-----------------------------------------------------------------
   * Returns a string representation of this pet.
   /*/
   public String toString()
   {
      return "My Name is " + name;
   }

   /**-----------------------------------------------------------------
   * This method should return a string indicating what this pet says.
   /*/
   abstract public String speak();
   //{return "sound";}

   /**-----------------------------------------------------------------
   * This method should return a string indicating how this pet moves.
   /*/
   abstract public String move();
}














