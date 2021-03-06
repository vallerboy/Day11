import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String name;
    private String lastname;
    private int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return lastname != null ? lastname.equals(person.lastname) : person.lastname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}' + "\n";
    }

    @Override
    public int compareTo(Person o) {
        return age - o.getAge();
    }

    public static class LastnameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getLastname().compareTo(o2.getLastname());
        }
    }

    public static class LastnameNameAndAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            int result = o1.getLastname().compareTo(o2.getLastname());
            if(result != 0){
                return result;
            }else if( o1.getName().compareTo(o2.getName()) != 0){
                return o1.getName().compareTo(o2.getName());
            }else{
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        }
    }

}
