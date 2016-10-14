import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/12/16.
 */

public class IO extends Zoo{
    Zoo z=new Zoo();

    public void showAnimalList(){
        if(animalList.isEmpty()){
            System.out.println("There are no animals listed \n");
        }
            for (int i = 0; i<animalList.size(); ++i) {
            System.out.println(animalList.get(i).displayAnimalInfo());
     }
 }

    public void showPeopleList(){
        if(peopleList.isEmpty()) {
            System.out.println("There are no people listed \n");
        }
        for (int i = 0; i<peopleList.size(); ++i) {
            System.out.println(peopleList.get(i).displayPersonInfo());
            }
        }

    public void personValidate() {
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = IO.personMenu();
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
}


