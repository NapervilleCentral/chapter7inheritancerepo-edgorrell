public class Cat extends Pet{
    private String mood;
    
    public Cat(String name, String mood){
        super(name);
        this.mood = mood;
    }
    public String toString(){
        String data = super.toString();
        data += "\n  Mood: " + this.mood;
        return data;
    }
    public String speak(){
        return "meow";
    }
    public String move(){
        return "*jumps*";    
    }
}