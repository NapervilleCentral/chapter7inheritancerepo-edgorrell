//********************************************************************
//  Snake.java       Author: Kevin/Thomas/Hayes
//
//  Represents a snake, which is a Reptile.
//********************************************************************

public class Snake extends Reptile
{
   private int length;

   //-----------------------------------------------------------------
   // Creates a snake with the given name and length.
   //-----------------------------------------------------------------
   public Snake( int snakeLength)
   {
      super(0);
      length = snakeLength;
   }

   //-----------------------------------------------------------------
   // Returns this snake's length.
   //-----------------------------------------------------------------
   public int getLength()
   {
      return length;
   }

   //-----------------------------------------------------------------
   // Returns a string representation of this snake.
   //-----------------------------------------------------------------
   public String toString()
   {
      return super.toString() + " is a snake, " + length + " inches long";
   }

   //-----------------------------------------------------------------
   // Returns a string indicating what this snake says.
   //-----------------------------------------------------------------
   public String speak()
   {
      return "hiss";
   }

   //-----------------------------------------------------------------
   // Returns a string indicating how this snake moves.
   //-----------------------------------------------------------------
   public String move()
   {
      return "slither";
   }
}//end odf snake
