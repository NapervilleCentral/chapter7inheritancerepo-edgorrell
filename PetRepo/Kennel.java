import java.util.ArrayList;
import java.util.Scanner;

public class Kennel{
    public static void main(String[] args){
        ArrayList<Pet> Kennel = new ArrayList<Pet>();
        Scanner scan = new Scanner(System.in);
        int choice, index;
        
        Kennel.add(new Dog("Stenzel", 50000));
        Kennel.add(new Cat("Ung", "mad"));
        Kennel.add(new Bird("Browning", 2));
        while(true){
            choice = 4;
            while(choice < 1 || choice > 3 && choice != -1){
                clear();
                System.out.println("Choose an Option: ");
                System.out.println("  1: Add a Pet");
                System.out.println("  2: Remove a Pet");
                System.out.println("  3: View all Pets");
                System.out.println(" -1: Exit");
                choice = scan.nextInt();
            }
            clear();
            if(choice == -1){
                System.out.println("idk");
                scan.nextLine();
                System.exit(0);
            }
            if(choice == 1){
                
            }
            if(choice == 2){
                
            }
            if(choice == 3){
                index = 0;
                for(Pet p : Kennel){
                    index++;
                    System.out.println(index);
                    System.out.println("------------------");
                    System.out.println(p);
                    System.out.println("------------------");
                    System.out.println();
                }
                scan.nextLine();
                scan.nextLine();
                continue;
            }
        }
    }
    public static void clear(){
        System.out.print('\u000c');
    }
}