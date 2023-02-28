public abstract class Pet{
    protected String name;

    public Pet(){
        this.name = "Pet";
    }
    public Pet(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        String data = this.getName();
        data += "\n  " + this.getClass();
        data = data.replace("class ","");
        return data;
    }
    abstract public String speak();
    abstract public String move();
}







