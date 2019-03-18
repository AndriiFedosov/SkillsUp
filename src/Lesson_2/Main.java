package Lesson_2;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation(25, 30);
        calculation.sum();
        System.out.println(calculation.sumReturn());
        calculation.div();
        System.out.println(calculation.divReturn());
        calculation.multiply();
        System.out.println(calculation.multiplyReturn());
        calculation.share();
        System.out.println(calculation.shareReturn());
        calculation.aliquot();
        System.out.println(calculation.aliquotReturn());
    }
}
