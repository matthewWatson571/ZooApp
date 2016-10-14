import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Menus {
    Zoo z = new Zoo();
    Employee e = new Employee();

    public void personValidate() {

        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = Menus.personMenu();
            switch (menuItem) {

                case 1:
                    z.newPerson();
                    break;
                case 2:
                    z.newEmployee();
                    break;
                case 3:e.displayInfo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose 1 or 2");
            }
        }
    }

    static int personMenu() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add an Employee or Visitor?");
        System.out.println("0. Exit to Main Menu");
        System.out.println("1. Visitor");
        System.out.println("2. Employee");
        System.out.println("3. View People List");
        choice = input.nextInt();
        return choice;
    }

    public void animalValidate() {
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = Menus.animalMenu();
            switch (menuItem) {

                case 1:
                    z.newPerson();
                    break;
                case 2:
                    z.newEmployee();
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose 1 or 2");
            }
        }
    }

    static int animalMenu() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add an Employee or Visitor?");
        System.out.println("0. Exit to Main Menu");
        System.out.println("1. Mammal");
        System.out.println("2. Fish");
        System.out.println("3. Bird");
        System.out.println("3. View Animal List");
        choice = input.nextInt();
        return choice;
    }

    public static void menuSwitch() throws IOException {
        IO io = new IO();
        Menus m = new Menus();
        String fileName = "Help.txt";
        int menuItem = -1;
        while (menuItem != 0)

        {
            menuItem = menu();
            switch (menuItem) {

                case 1:
                    m.personValidate();
                    break;
                case 2:
                    m.animalValidate();
                    break;
                case 3:
                    io.showPeopleList();//view lists, switches people(employee,visitor,both) animals(mammal,bird,fish,all)
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
}