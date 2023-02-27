import java.util.ArrayList;
import java.util.Scanner;

public class Kennel{
    public static void main(String[] args){
        ArrayList<Pet> Kennel = new ArrayList<Pet>();
        Scanner scan = new Scanner(System.in);
        int choice;
        
        Kennel.add(new Dog("Stenzel", 50000));
        Kennel.add(new Cat("Ung", "mad"));
        Kennel.add(new Bird("Browning", 2));
        while(true){
            System.out.println("Choose an Option: ");
            System.out.println("  1: Add a Pet");
            System.out.println("  2: Remove a Pet");
            System.out.println("  3: View all Pets");
            System.out.println(" -1: Exit");
        }
    }
}