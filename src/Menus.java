import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Menus {
    Zoo z = new Zoo();

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
                case 3:
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
}
