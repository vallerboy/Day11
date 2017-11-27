import java.util.*;

public class Starter {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Damian", "Mendyk", 28));
        personList.add(new Person("Kamil", "Zamachowski", 54));
        personList.add(new Person("Miroslawa", "Zientek", 21));
        personList.add(new Person("Kamila", "Brygiel", 30));
        personList.add(new Person("Tomek", "Jankowski", 81));

        //Collections.sort(personList, new Contact.LastnameComparator());

        Set<Person> set = new TreeSet<>(new Person.LastnameNameAndAgeComparator());
        set.addAll(personList);

        print(null);
        System.out.println(set);
    }

    public static void print(String s){
        s.intern();
        System.out.println(s);
    }


}
