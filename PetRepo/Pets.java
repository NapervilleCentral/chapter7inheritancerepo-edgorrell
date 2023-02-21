//********************************************************************
//  Pets.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of abstract classes.
//********************************************************************

public class Pets
{
   //-----------------------------------------------------------------
   /**  Instantiates a dog, cat and a snake object and prints information
   //  about them.
   */
   public static void main (String[] args)
   {

	  Pet Rex = new Dog("Rex",50);
	  System.out.println(Rex.speak()  );

	  Rex = new Cat("Lester");
	  System.out.println(Rex.speak()  );

      Dog fido = new Dog("Fido", 45);

      Cat boots = new Cat("PUSSinBOOTS");

/*
	  System.out.println();
	  System.out.println(boots);
	  System.out.println(boots.getName() + " says " + boots.speak());
	  System.out.println(boots.move() + " " + boots.getName() + " "
				 + boots.move());


	System.out.println(fido);
	System.out.println(fido.getName() + " says " + fido.speak());
	System.out.println(fido.move() + " " + fido.getName() + " "
				 + fido.move());


















   	//Snake sam = new Snake("Sam", 30);
    Poodle hadley = new Poodle(65,"Cream", "Hadley");
/**/	Lab Boston = new Lab(65,"Cream", "Boston");












      System.out.println(fido);
      System.out.println(fido.getName() + " says " + fido.speak());
      System.out.println(fido.move() + " " + fido.getName() + " "
                         + fido.move());


	 System.out.println(hadley);
	 System.out.println(hadley.getName() + " says " + hadley.speak());
	 System.out.println(hadley.move() + " " + hadley.getName() + " "
				 + hadley.move());




/*
      System.out.println();
      System.out.println(sam);
      System.out.println(sam.getName() + " says " + sam.speak());
      System.out.println(sam.move() + " " + sam.getName() + " "
                         + sam.move());
/**/





   }
}
