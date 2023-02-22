public class Cobra extends Snake{
    public Cobra(){
        super(20);
    }
    
    public String toString(){
        String data = super.toString();
        data = data.replace("snake", "cobra");
        return data;
    }
}