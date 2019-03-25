package lesson_5;

import java.util.Objects;

public class Cat extends Animal {
    private int lifes;
    private double sleepTime;

    public Cat(String color, int age, int lifes, double sleepTime) {
        super(color,age);
        this.lifes = lifes;
        this.sleepTime = sleepTime;
    }

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    public double getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(double sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void voice() {
        System.out.println("mau mau");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return lifes == cat.lifes &&
                Double.compare(cat.sleepTime, sleepTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lifes, sleepTime);
    }

}
