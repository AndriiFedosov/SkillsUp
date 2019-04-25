package lesson_13;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Integer> ints = new ArrayList<>();
//        for (int index = 0; index < 10; index++) {
//            ints.add((int) (Math.random() * 10));
//        }
//        for (Integer integer: ints){
//            System.out.println(integer);
//        }
//        System.out.println("------------------------------------");
//        ints.stream().forEachOrdered(integer1 ->{
//            System.out.print(integer1);
//            System.out.println("integer from stream");
//        } );
//        ints.forEach(System.out::println);
        List<Person> personList = new ArrayList<>();

        List<Person> personList2 = new ArrayList<>();

        for (int index = 0; index < 10; index++) {
            personList.add(new Person("Person" + ((int) (Math.random() * 60)), (int) (Math.random() * 60)));
        }

        personList.forEach(item -> {
            Person person = new Person(item.getName() + " from first list", item.getAge());
            personList2.add(person);
        });

        personList2.forEach(System.out::println);

        boolean filteredPersons = personList2
                .stream()
                .filter(person -> person.getAge() > 20)
                .sorted(Comparator.comparing(Person::getAge))
//                .map(person -> {
//                    person.setAge(person.getAge() + 10);
//                    return person.getAge();
//                })
                .peek(person -> {
                    person.setAge(person.getAge()+1);
                    person.setName(person.getName()+" modifired ");
                })
                .allMatch(person -> person.getName().contains("2"));

        System.out.println("List was filtered by age");
        System.out.println(filteredPersons);
//        filteredPersons.forEach(System.out::println);




    }
}
