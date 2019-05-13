package lesson_15;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

//        String hello = "hi man!";
//
//        byte[] bytes = hello.getBytes();
//
//        try (FileOutputStream fileOutputStream = new FileOutputStream("hello.txt")) {
//            fileOutputStream.write(bytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File file = new File("hello.txt");
//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//            int number = -1;
//            StringBuilder litteral = new StringBuilder();
//            while ((number = fileInputStream.read()) != -1) {
//                litteral.append((char) number);
//            }
//
//            System.out.println(litteral.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Person person4 = new Person("Andry", "Fedosov", 25,
                1.78, false, LocalDate.of(1993, 07, 05));
        Person person1 = new Person("Sasha", "Arbusov", 27,
                1.55, true, LocalDate.of(1992, 07, 05));
        Person person2 = new Person("Tania", "Yablunewa", 21,
                1.85, false, LocalDate.of(1991, 07, 05));
        Person person3 = new Person("Nikolay", "Krivoy", 23, 1.98,
                true, LocalDate.of(1994, 07, 05));
//
        List<Person> people = new ArrayList<>(
                Arrays.asList(person4, person1, person2, person3));
//
//        Util.writeIntoFile(people);
//
//        Util.printIntoConsoleAllFromFile();
//
//        List<Person> secondList = Util.getPersonsListFormFile();
//
//        secondList.forEach(System.out::println);
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.txt"));

        people.forEach(person -> {
            try {
                dataOutputStream.writeUTF(person.getFirstName());
                dataOutputStream.writeUTF(person.getLastName());
                dataOutputStream.writeInt(person.getAge());
                dataOutputStream.writeDouble(person.getHeight());
                dataOutputStream.writeBoolean(person.isMarried());
                dataOutputStream.writeUTF(String.valueOf(person.getBirthDay()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.txt"));

        System.out.println(dataInputStream.readUTF());
        System.out.println(dataInputStream.readUTF());
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readDouble());
        System.out.println(dataInputStream.readBoolean());
        System.out.println(dataInputStream.readUTF());


    }
}
