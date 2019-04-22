package lesson_12;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Country> countries = new TreeSet<>();

        Country ukraine = new Country(630, "Ukraine", 30);
        Country usa = new Country(15000, "USA", 500);
        Country deutschland = new Country(380, "Deutschland", 39);
        Country japan = new Country(800, "Japan", 100);

        countries.add(ukraine);
        countries.add(usa);
        countries.add(deutschland);
        countries.add(japan);

        for (Country country:countries){
            System.out.println(country.toString());
        }

    }
}
