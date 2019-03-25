package lesson_5;

import java.util.Objects;

public class Passager {
    private String name;
    private int age;

    public Passager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Passager passager = (Passager) o;
        return age == passager.age &&
                Objects.equals(name, passager.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Passager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Car sitInCar(Car car, Passager passager) {
        if (car.getCapacity() > 1 && car.getCapacity() <= 4) {
            for (int countOfPass = 0; countOfPass < car.getPassagers().length; countOfPass++) {
                if (car.getPassagers()[countOfPass] == null) {
                    car.getPassagers()[countOfPass] = passager;
                    break;
                } else {
                    System.out.println("Sorry our car this place is full");
                }
            }
        }
        return car;
    }

    public Car getOutOfCar(Car car, Passager passager) {
        for (int count = 0; count < car.getPassagers().length; count++) {
            if (car.getPassagers()[count].equals(passager)) {
                car.getPassagers()[count] = null;
                System.out.println("This place of passangers is free.");
            }
        }
        return car;
    }
}
