import java.util.ArrayList;
import java.util.Scanner;

public class Kennel{
    public static void main(String[] args){
        ArrayList<Pet> kennel = new ArrayList<Pet>();
        Pet p = null;
        Scanner scan = new Scanner(System.in);
        int choice, index;
        
        kennel.add(new Dog("Stenzel", 50000));
        kennel.add(new Cat("Ung", "mad"));
        kennel.add(new Bird("Browning", 2));
        
        while(true){
            choice = 4;
            while(!(choice == -1) && !(choice > 0 && choice < 4)){
                clear();
                System.out.println("Choose an Option: ");
                System.out.println("  1: Add a Pet");
                System.out.println("  2: Remove a Pet");
                System.out.println("  3: View all Pets");
                System.out.println(" -1: Exit");
                choice = scan.nextInt();
            }
            if(choice == -1){
                System.exit(0);
            }
            if(choice == 1){
                choice = 0;
                while(!(choice > 0 && choice < 4)){
                    clear();
                    System.out.println("Choose Pet Type:");
                    System.out.println("  1: Dog");
                    System.out.println("  2: Bird");
                    System.out.println("  3: Cat");
                    choice = scan.nextInt();
                }
                clear();
                if(choice == 1){
                    System.out.println("Enter 1 if pet is a Lab:");
                    choice = scan.nextInt();
                    System.out.print("Enter Pet Name & Weight");
                    scan.nextLine();
                    if(choice == 1){
                        System.out.println(" & Color:");
                        p = new Lab(scan.nextLine(), scan.nextDouble(),scan.nextLine());
                    } else {
                        System.out.println(":");
                        p = new Dog(scan.nextLine(), scan.nextInt());
                    }
                }
                if(choice == 2){
                    System.out.println("Enter Pet Name & Wingspan:");
                    scan.nextLine();
                    p = new Bird(scan.nextLine(), scan.nextInt());
                }
                if(choice == 3){
                    System.out.println("Enter Pet Name & Mood:");
                    scan.nextLine();
                    p = new Cat(scan.nextLine(), scan.nextLine());
                }
                kennel.add(p);
                continue;
            }
            if(choice == 2){
                clear();
                System.out.println("Kennel:\n");
                index = 0;
                for(Pet pet : kennel){
                    index++;
                    System.out.println(index);
                    System.out.println("------------------");
                    System.out.println(pet);
                    System.out.println("------------------");
                    System.out.println();
                }
                System.out.println("Select pet number to remove: ");
                try{
                    kennel.remove(scan.nextInt()-1);
                    System.out.println("Enter how many days the pet was boarded:");
                    choice = scan.nextInt();
                    System.out.println("You Owe $" + choice * 30);
                    scan.nextLine();
                    scan.nextLine();
                }catch (Exception e){
                    System.out.println("Pet Nonexistent!");
                    scan.nextLine();
                    scan.nextLine();
                }
                continue;
            }
            if(choice == 3){
                clear();
                System.out.println("Kennel:\n");
                for(Pet pet : kennel){
                    System.out.println("------------------");
                    System.out.println(pet);
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