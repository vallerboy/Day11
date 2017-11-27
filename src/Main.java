import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Damian", "Mendyk", 28));
        personList.add(new Person("Kamil", "Zamachowski", 54));
        personList.add(new Person("Miroslawa", "Zientek", 21));
        personList.add(new Person("Kamila", "Brygiel", 30));
        personList.add(new Person("Tomek", "Jankowski", 81));

        Collections.sort(personList);

        System.out.println(personList);
    }
}
