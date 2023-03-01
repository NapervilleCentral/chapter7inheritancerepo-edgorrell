import java.text.DecimalFormat;

public class Dog extends Pet{
    private DecimalFormat fmt = new DecimalFormat("0.##");
    private double weight;
    
    public Dog(String name, double weight){
        super(name);
        this.weight = weight;
    }
    public String toString(){
        String data = super.toString();
        data += "\n  Weight: " + fmt.format(this.weight);
        return data;
    }
    public String speak(){
        return "woof";
    }
    public String move(){
        return "*runs*";
    }
}