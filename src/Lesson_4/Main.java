package Lesson_4;


public class Main {
    public static void main(String[] args) {

//        Cat waska = new Cat();
//        Cat murka = new Cat("Murka",null,2.2,2,false);
//        System.out.println(waska.toString());
//        System.out.println(murka.toString());

//        waska.setName("Waska");
//        System.out.println(waska.toString());
//        waska.setColor("Black");
//        System.out.println(waska.toString());
//        waska.setWight(2.0);
//        System.out.println(waska.toString());
//        waska.setAge(3);
//        System.out.println(waska.toString());
//        waska.setMale(true);
//        System.out.println(waska.toString());
        Util util = new Util();
        Cat cat = new Cat();
        System.out.println(isInteger(cat));


    }

    private static boolean isInteger(Object object) {
        return object instanceof Cat;
    }
}
