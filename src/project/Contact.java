package project;

public class Contact implements Comparable<Contact>{
    private String name;
    private String lastname;
    private String number;

    public Contact(String name, String lastname, String number) {
        this.name = name;
        this.lastname = lastname;
        this.number = number;
    }

    public Contact() {}

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact person = (Contact) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (lastname != null ? !lastname.equals(person.lastname) : person.lastname != null) return false;
        return number != null ? number.equals(person.number) : person.number == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contact o) {
        return this.getNumber().compareTo(o.getNumber());
    }
}

