package Lesson_2.util;

public class UtilImpl implements IUtil {

    public int factorial(int count) {
        return 0;
    }

    public int rate(int number, int rate) {
        return 0;
    }

    public void increment(int number) {

    }

    public void decrement(int number) {

    }

    public void fibonachiRow() {

    }

    public void concetinationString() {

    }

    public void multiplyTable() {
        for (int firsElement = 1; firsElement <= 10; firsElement++) {
            for (int secondElement = 1; secondElement <= 10; secondElement++) {
                System.out.print(firsElement + "x" + secondElement + "=" + firsElement * secondElement + " ");
            }
            System.out.println("\n");
        }
    }

    public void multiplyTableVertical() {
        for (int firsElement = 1; firsElement <= 10; firsElement++) {
            for (int secondElement = 1; secondElement <= 10; secondElement++) {
                System.out.print(secondElement + "x" + firsElement + "=" + firsElement * secondElement + " ");
            }
            System.out.println("\n");
        }
    }

    public void tree() {

        for (int mainIndex = 0; mainIndex < 10; mainIndex++) {
            for (int firstIndex = 0; firstIndex < 10 - mainIndex; firstIndex++)
                System.out.print(" ");
            for (int secondIndex = 0; secondIndex < (2 * mainIndex + 1); secondIndex++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void reverseTree(){
        for (int mainIndex = 10; mainIndex >= 0; mainIndex--) {
            for (int firstIndex = 0; firstIndex < 10 - mainIndex; firstIndex++)
                System.out.print(" ");
            for (int secondIndex = 0; secondIndex < (2 * mainIndex + 1); secondIndex++)
                System.out.print("*");
            System.out.println();
        }
    }

}
