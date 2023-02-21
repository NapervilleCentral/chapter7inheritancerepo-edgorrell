//********************************************************************
//  Reptile.java       Author: Kevin/Terrific/Hayes
//
//  Represents a Reptile.
//********************************************************************

public abstract class Reptile extends Animal
{
   private int numberOfLegs;


   /**-----------------------------------------------------------------
   *  Creates a reptile with no Legs.
   */

	public Reptile()
	{
		//call the default constructor of Animal
		//happens automatic
		//super();

		super("reptile");
		//type = "reptile"; // private data will cause error
		numberOfLegs = 0;
	}


/**-----------------------------------------------------------------
   *  Creates a reptile with n Legs.
   */

	public Reptile( int n_o_L)
	{
		super("reptile");
		numberOfLegs = n_o_L;
	}






   /**-----------------------------------------------------------------
    *  Returns this Reptiles number of Legs
   /*/
  public int getLegs()
  {
	 return numberOfLegs;
  }

  /**-----------------------------------------------------------------
     * This method should return a string indicating how this Reptile moves.
     /*/
  //public String move()
  //{
	//  return "crawl";
  //}



  /**-----------------------------------------------------------------
  * Returns a string representation of this Animal.
  /*/
  public String toString()
  {
	 return super.toString() +
	 "\nI have "+getLegs()+ " number of Legs";
   }

}














