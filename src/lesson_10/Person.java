package lesson_10;

public class Person {
    private int age;
    private String surname;

    public Person(int age, String surname) {
        this.age = age;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return surname != null ? surname.equals(person.surname) : person.surname == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }
}
