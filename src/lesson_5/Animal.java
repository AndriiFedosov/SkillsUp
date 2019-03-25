package lesson_5;

import java.util.Objects;

public class Animal {
    private String color;
    private int age;

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public void voice(){
        System.out.println("this is voice of animal");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
