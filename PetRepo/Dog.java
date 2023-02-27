public class Dog extends Pet{
    private double weight;
    
    public Dog(String name, double weight){
        super(name);
        this.weight = weight;
    }
    public String toString(){
        String data = super.toString();
        data += "\n  " + this.weight;
        return data;
    }
    public String speak(){
        return "woof";
    }
    public String move(){
        return "*runs*";
    }
}