import java.util.*;

public class Kennel{
    public static void main(String[] args){
        ArrayList<Pet> kennel = new ArrayList<Pet>();
        String[] types = {"Dog","Bird","Cat"};
        Pet p = null;
        Scanner scan = new Scanner(System.in);
        String name;
        int choice, index;
        boolean check;
        
        for(int i = 0; i < 10; i++){
            name = "";
            for(int j = 0; j < 10; j++){
                if(Math.random() < 0.4){
                    continue;
                }
                name += (char)(97 + 26*Math.random());
            }
            choice = (int)(3*Math.random()) + 1;
            switch(choice){
                case 1:
                    kennel.add(new Dog(name, 100*Math.random() + 50));
                    break;
                case 2:
                    kennel.add(new Bird(name, (int)(10*Math.random())+2));
                    break;
                case 3:
                    kennel.add(new Cat(name, "mad"));
                    break;
            }
        }

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
                choice = 0;
                while(!(choice > 0 && choice < 4)){
                    clear();
                    System.out.println("Choose Pet Type:");
                    System.out.println("  1: Dog");
                    System.out.println("  2: Bird");
                    System.out.println("  3: Cat");
                    choice = scan.nextInt();
                }
                System.out.println("Enter Name of Pet To Remove:");
                scan.nextLine();
                name = scan.nextLine();
                check = false;
                index = -1;
                for(Pet pet : kennel){
                    if(pet.getName().equals(name) && (pet.getClass()+"").equals("class " + types[choice-1])){
                        index = kennel.indexOf(pet);
                        check = true;
                        break;
                    }
                }
                if(check){
                    kennel.remove(index);
                    System.out.println("Enter how many days the pet was boarded:");
                    choice = scan.nextInt();
                    System.out.println("You Owe $" + choice * 30);
                    scan.nextLine();
                    scan.nextLine();
                }else{
                    System.out.println("Pet Nonexistent!");
                    scan.nextLine();
                    scan.nextLine();
                }
                continue;
            }
            if(choice == 3){
                clear();
                kennel.sort(Comparator.naturalOrder());
                System.out.println("Kennel:\n");
                for(Pet pet : kennel){
                    System.out.println("------------------");
                    System.out.println(pet);
                    System.out.println("------------------");
                    System.out.println();
                }
                System.out.println("Press Enter to Continue:");
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