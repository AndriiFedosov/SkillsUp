package Lesson_3.homeWork;

import java.util.Scanner;

public class Calculation {
    private static final String BIGGER = "bigger";
    private static final String LESS = "less";
    private static final String EQUAL = "equal";
    private static final String DISCRIMINANT = "Discriminant is: ";
    private static final String ROOT_ONE = " x1: ";
    private static final String ROOT_TWO = " x2: ";
    private static final String NO_RESULTS = "No results";

    public void calculateRoots(double aIndex, double bIndex, double cIndex) {
        double discriminant = Math.pow(bIndex, 2) - (4 * aIndex * cIndex);
        String discriminantState =
                discriminant > 0 ?
                        BIGGER
                        : (discriminant == 0
                        ? EQUAL
                        : LESS);
        switch (discriminantState) {
            case BIGGER: {
                double root1 = ((-1) * bIndex + Math.sqrt(discriminant)) / (2 * aIndex);
                double root2 = ((-1) * bIndex - Math.sqrt(discriminant)) / (2 * aIndex);
                System.out.println(DISCRIMINANT + discriminant + ROOT_ONE + root1 + ROOT_TWO + root2);
                break;
            }
            case EQUAL: {
                double root = ((-1) * bIndex) / (2 * aIndex);
                System.out.println(DISCRIMINANT + discriminant + ROOT_ONE + root + ROOT_TWO + root);
                break;
            }
            case LESS: {
                System.out.println(NO_RESULTS);
            }
        }
    }

    public void showFibonachiRow(int count) {
        int first = 0;
        int second = 1;
        int tempVar;
        System.out.print(first + " " + second + " ");
        for (int index = 2; index <= count; index++) {
            tempVar = first + second;
            System.out.print(tempVar + " ");
            first = second;
            second = tempVar;
        }
    }

    public void printMultiplyTable() {
        for (int first = 0; first++ <= 10; ) {
            for (int second = 0; second++ <= 10; ) {
                System.out.print(second + " * " + first + " = " + first * second + " ");
            }
            System.out.println();
        }
    }

    public void printTree() {
        for (int first = 0; first < 10; first++) {
            for (int second = 0; second < first; second++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printReversTree() {
        for (int first = 10; first > 0; first--) {
            for (int second = 0; second < first; second++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int calculateFactorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * (calculateFactorial(number - 1));
        }
    }

    public void printGreeting(int hour) {
        if ((hour >= 22 && hour <= 24) || (hour >= 0 && hour <= 3)) {
            System.out.println("Good night.");
        } else if (hour >= 4 && hour <= 11) {
            System.out.println(" Good morning.");
        } else if (hour >= 12 && hour <= 18) {
            System.out.println("Good day.");
        } else if (hour >= 19 && hour <= 21) {
            System.out.println("Good evening.");
        } else {
            System.out.println("Sorry you enter wrong time.");
        }
    }

    public void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 20);
        boolean bingo = true;
        while (bingo) {
            System.out.println("Enter your number");
            int enteredNumber = scanner.nextInt();
            if (enteredNumber == randomNumber) {
                bingo = false;
                System.out.println("You win!");
            } else {
                System.out.println("Sorry try next...");
            }
        }
    }

    public void getEvenNum(Scanner scanner) {
        System.out.println("enter first argument");
        int firstIndex = scanner.nextInt();
        System.out.println("enter second argument");
        int secondIndex = scanner.nextInt();
        while (firstIndex < secondIndex) {
            if (firstIndex % 2 == 0) {
                System.out.print(firstIndex + " ");
            }
            firstIndex++;
        }
    }

    public void getOddNum(int firstIndex, int secondIndex) {
        do {
            if (firstIndex % 2 != 0) {
                System.out.print(firstIndex + " ");
            }
            firstIndex++;
        }
        while (firstIndex < secondIndex);
    }

    public String getRootsByViet(final int indexA, final int indexB, final int indexC) {

        int firstResult = indexB / indexA;
        int secondResult = indexC / indexA;
        int sign1 = 1;
        int sign2 = 1;

        if (secondResult < 0) {
            sign1 = -1;
        } else if ((secondResult > 0) && (firstResult > 0)) {
            sign1 = -1;
            sign2 = -1;
        }

        secondResult = Math.abs(secondResult);

        double[] results = getAllVariables(secondResult);

        int length = 0;
        double x1;
        double x2;
        while (length < results.length) {
            double variable = results[length];
            x1 = variable * sign1;
            x2 = secondResult / variable * sign2;
            if (x1 + x2 == -firstResult) {
                return ROOT_ONE + x1 + ROOT_TWO + x2;
            }
            length++;
        }

        return NO_RESULTS;
    }

    private double[] getAllVariables(final int numbersLimit) {
        double[] result = new double[numbersLimit];

        final int limit = (int) Math.sqrt(numbersLimit);

        for (int firstIndex = 1; firstIndex <= limit; firstIndex++) {
            if (numbersLimit % firstIndex == 0) {
                if (numbersLimit / firstIndex != firstIndex) {
                    result[firstIndex] = numbersLimit / (double) firstIndex;
                }
                result[firstIndex] = firstIndex;
            }
        }

        return result;

    }
}
