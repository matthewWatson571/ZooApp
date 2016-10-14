/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Bird extends Animal {
    int wingSpan;

    public Bird(String n, int a, String t, int w) {
        super(n, a, t);

        w=wingSpan;

    }
    public String displayAnimalInfo(){

        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Type: " + type + "\n" + "Wingspan: " + wingSpan+ "\n";
    }
}
