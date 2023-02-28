public abstract class Pet implements Comparable<Pet>{
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
    public boolean equals(Pet p){
        return this.name.equals(p.name);
    }
    public int compareTo(Pet p){
        String s1, s2;
        s1 = this.getClass() + "".replace("class ","");
        s2 = p.getClass() + "".replace("class ","");
        return s1.compareTo(s2);
    }
    abstract public String speak();
    abstract public String move();
}