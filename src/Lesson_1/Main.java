package Lesson_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Obi-Van:Hello there!");
        System.out.println("General Grievous: General Kenobi.");
        Car car1 = new Car();
        car1.run();
        String s = null;
        System.out.println("s = " + s);
        char c = 'c';
        System.out.println("one two");
        System.out.println("one\n two");
        System.out.println("c = " + c);
        int[] arrInt = {120, 12, 3, 5};
        arrInt[0] = 42;
        System.out.println("arrInt[0] = " + arrInt[0]);
        System.out.println("arrInt[1] = " + arrInt[1]);
        System.out.println("arrInt[2] = " + arrInt[2]);
        System.out.println("arrInt[3] = " + arrInt[3]);
    }
}
