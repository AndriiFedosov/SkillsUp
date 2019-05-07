package lesson_14;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Person person = new Person("Andry", 25);
//        Optional<Person> optionalPersonWithObject = Optional.of(person);
//        Optional<Person> optionalPerson = Optional.empty();
//        System.out.println(optionalPerson);
//        System.out.println(optionalPersonWithObject);
//        if (optionalPersonWithObject.isPresent()){
//            System.out.println(" optional person is present");
//        }
        Method method = person.getClass().getDeclaredMethod("getName");
        Method[] methods = person.getClass().getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);
        Class<Person> personClass = (Class<Person>) person.getClass();


    }
}
