public class Lab extends Dog{
    private String color;

    public Lab(String name, double weight, String color){
        super(name, weight);
        this.color = color;
    }
    public String toString(){
        String data = super.toString();
        data += "\n  Color: " + this.color;
        return data;
    }
}
