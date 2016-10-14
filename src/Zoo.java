import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Zoo {
    Scanner s = new Scanner(System.in);
    public static ArrayList<Animal> animalList = new ArrayList();
    public static ArrayList<Person> peopleList = new ArrayList();

    public void newPerson(){
        String name, email;
        int age;
        System.out.println("Would you like to add a new person?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")){
            System.out.println("Name: ");
            name=s.nextLine();
            System.out.println("Age: ");
            age=s.nextInt();
            s.nextLine(); // cause Eagle said so //
            System.out.println("Email address: ");
            email=s.nextLine();
            Person newPerson = new Person(name,age,email);
            peopleList.add(newPerson);
            System.out.println("You added " + name + " to the list");
            System.out.println("Would you like to add another person?");
            response = s.nextLine();
        }
    }
    public void newEmployee(){
        String name, email;
        int age,idNum;
        System.out.println("Would you like to add a new person?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")){
            System.out.println("Name: ");
            name=s.nextLine();
            System.out.println("Age: ");
            age=s.nextInt();
            s.nextLine(); // cause Eagle said so //
            System.out.println("Email address: ");
            email=s.nextLine();
            System.out.println("Employee ID: ");
            idNum=s.nextInt();
            Employee newPerson = new Employee(name,age,email,idNum);
            Zoo.peopleList.add(newPerson);
            System.out.println("You added " + name + " to the list");
            System.out.println("Would you like to add another person?");
            response = s.nextLine();
        }
    }
    public void newAnimal(){
        String name, type;
        int age;
        System.out.println("Would you like to add a new animal?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")){
            System.out.println("Name: ");
            name=s.nextLine();
            System.out.println("Age: ");
            age=s.nextInt();
            s.nextLine();
            System.out.println("Mammal/Bird/Fish: ");
            type=s.nextLine();
            Animal newAnimal = new Animal(name,age,type);
            animalList.add(newAnimal);
            System.out.println("You added " + name + " to the list");
            System.out.println("Would you like to add another animal?");
            response = s.nextLine();
        }
    }

    public void newBird(){

    }
    public void newFish(){

    }
    public void newMammal(){
        
    }
}
