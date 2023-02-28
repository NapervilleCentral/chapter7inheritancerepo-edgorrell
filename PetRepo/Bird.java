public class Bird extends Pet{
    private int wingspan;
    
    public Bird(String name,int wingspan){
        super(name);
        this.wingspan = wingspan;
    }
    public String toString(){
        String data = super.toString();
        data += "\n  Wingspan: " + this.wingspan;
        return data;
    }
    public int getWingspan(){
        return this.wingspan;
    }
    public String speak(){
        return "tweet";
    }
    public String move(){
        return "*falls*";
    }
}