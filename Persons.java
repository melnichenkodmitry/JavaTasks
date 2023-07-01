import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Persons {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person;
        String key;
        while (true) {
            key = reader.readLine();
            if (!((key.equals("user")) || (key.equals("loser")) || (key.equals("coder")) || (key.equals("proger")))) {
                break;
            }

            switch (key) {
                case "user":
                    person = new Person.User();
                    doWork(person);
                    break;
                case "loser":
                    person = new Person.Loser();
                    doWork(person);
                    break;
                case "coder":
                    person = new Person.Coder();
                    doWork(person);
                    break;
                case "proger":
                    person = new Person.Proger();
                    doWork(person);
                    break;
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        }
        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
