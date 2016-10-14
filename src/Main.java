import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/12/16.
 */
public class Main {
    public static void  main(String[] args) throws IOException{
        IO io=new IO();
        Menus m =new Menus();
        Zoo z = new Zoo();
        String fileName = "Help.txt";
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {

                case 1:
                    m.personValidate();
                    break;
                case 2:
                    m.animalValidate();
                    break;
                case 3:
                    io.showPeopleList();
                    break;
                case 4:
                    io.showAnimalList();
                    break;
                case 5:
                    //one.loadList();
                    break;
                case 6:
                    //one.exportList();
                    break;
                case 7:
                    //one.clearList();
                    break;
                case 8:
                    Desktop.getDesktop().open(new File(fileName));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
    }
    static int menu() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("---Zooly---");
        System.out.println("0. Exit the program");
        System.out.println("1. Add a Person");
        System.out.println("2. Add an Animal");
        System.out.println("3. View People List");
        System.out.println("4. View Animal List");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. HELP!");
        System.out.println();
        System.out.println("Please Enter a choice: ");
        choice = input.nextInt();
        return choice;
    }
//    Animal a1=new Animal("Joe",7,"Mammal");
//    System.out.println(a1.displayAnimalInfo());
//    Person p1=new Person("Kenn",75);
//    System.out.println(p1.displayPersonInfo());

}

