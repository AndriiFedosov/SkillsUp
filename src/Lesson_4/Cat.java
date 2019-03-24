package Lesson_4;

import java.util.Objects;

public class Cat {

    private String name;
    private String color;
    private double wight;
    private int age;
    private boolean male;

    public Cat(String nameOfCat, String color, double wight, int age, boolean male) {
        this.name = nameOfCat;
        this.color = color;
        this.wight = wight;
        this.age = age;
        this.male = male;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Double.compare(cat.wight, wight) == 0 &&
                age == cat.age &&
                male == cat.male &&
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, wight, age, male);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", wight=" + wight +
                ", age=" + age +
                ", male=" + male +
                '}';
    }
}
