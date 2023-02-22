public class Snake extends Reptile{
    private int length;


    public Snake(int snakeLength){
        super("Snake", 0);
        length = snakeLength;
    }

    public int getLength(){
        return length;
    }

    //-----------------------------------------------------------------
    // Returns a string representation of this snake.
    //-----------------------------------------------------------------
    public String toString(){
        String data = super.toString();
        data += "Is a snake of length " + this.length + "\n";
        return data;
    }

    //-----------------------------------------------------------------
    // Returns a string indicating what this snake says.
    //-----------------------------------------------------------------
    public String speak(){
        return "hiss";
    }

    //-----------------------------------------------------------------
    // Returns a string indicating how this snake moves.
    //-----------------------------------------------------------------
    public String move(){
        return "slither";
    }
}
