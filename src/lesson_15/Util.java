package lesson_15;

import javax.imageio.stream.FileImageOutputStream;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Util {
    private static final String FIRST_NAME = "First Name: ";
    private static final String LAST_NAME = "Last Name: ";
    private static final String AGE = "Age: ";
    private static final String HEIGHT = "Height: ";
    private static final String MARRIED = "Married: ";
    private static final String BIRTH_DAY = "Birth day: ";
    private static final String WORD_SEPARATOR = ", ";
    private static final String LINE_SEPARATOR = "\n";
    private static final String LIST_PATH = "person.txt";


    static void writeIntoFile(List<Person> people) throws IOException {
        FileWriter writer = new FileWriter(new File(LIST_PATH));
        for (Person person : people) {
            writer.write(FIRST_NAME + person.getFirstName() + WORD_SEPARATOR +
                    LAST_NAME + person.getLastName() + WORD_SEPARATOR +
                    AGE + person.getAge() + WORD_SEPARATOR +
                    HEIGHT + person.getHeight() + WORD_SEPARATOR +
                    MARRIED + person.isMarried() + WORD_SEPARATOR +
                    BIRTH_DAY + person.getBirthDay() + WORD_SEPARATOR +
                    LINE_SEPARATOR);
        }
        writer.close();
    }

    static List<Person> getPersonsListFormFile() throws IOException {
        List<Person> people = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(new File(LIST_PATH)));
        reader.lines().forEach((String item) -> {
            Person person = new Person();
            String[] parameters = item.split(", ");
            for (String parameter : parameters) {
                if (parameter.contains(FIRST_NAME)) {
                    person.setFirstName(parameter.split(":")[1]);
                }
                if (parameter.contains(LAST_NAME)) {
                    person.setLastName(parameter.split(":")[1]);
                }
                if (parameter.contains(AGE)) {
                    person.setAge(Integer.parseInt(parameter.split(":")[1].trim()));
                }
                if (parameter.contains(HEIGHT)) {
                    person.setHeight(Double.parseDouble(parameter.split(":")[1].trim()));
                }
                if (parameter.contains(MARRIED)) {
                    person.setMarried(Boolean.parseBoolean(parameter.split(":")[1].trim()));
                }
                if (parameter.contains(BIRTH_DAY)) {
                    person.setBirthDay(LocalDate.parse(parameter.split(":")[1].trim()));
                }
            }
            people.add(person);
        });

        return people;
    }

    public static void printIntoConsoleAllFromFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(LIST_PATH));
        int litteral = -1;
        StringBuilder stringBuilder = new StringBuilder();
        while ((litteral = fileInputStream.read()) != -1) {
            stringBuilder.append((char) litteral);
        }

        System.out.println(stringBuilder.toString());
    }

    static void replaceAllFalseToTrue(String path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(path));
        int litteral = -1;
        StringBuilder stringBuilder = new StringBuilder();
        while ((litteral = fileInputStream.read()) != -1) {
            stringBuilder.append((char) litteral);
        }
        ;
        String newFile = stringBuilder.toString().replaceAll("false", "true");

        byte[] fileBytes = newFile.getBytes();

        FileImageOutputStream fileImageOutputStream = new FileImageOutputStream(new File(path));
        fileImageOutputStream.write(fileBytes);
    }
}
