/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Mammal extends Animal {
    boolean hibernates;
    public Mammal(String n, int a, String t, Boolean h) {
        super(n, a, t);
        hibernates=h;
    }
    public String displayAnimalInfo(){

        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Type: " + type + "\n" + "Hibernating: " + "\n";
    }
}
