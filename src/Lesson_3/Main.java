package Lesson_3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstA = 40;
        int firstB = 8;
        int secondA = 40;
        int secondB = 8;
        String result = ternar(250, 5) ? " true " :  "false";
        System.out.println(firstA >= firstB);
        System.out.println(firstA <= firstB);
        System.out.println(firstA == firstB);
        System.out.println(firstA > firstB);
        System.out.println(firstA < firstB);

        firstA++;
        System.out.println(firstA);
        firstA = firstA + 1;
        System.out.println(firstA);

        secondA--;
        System.out.println(secondA);
        secondA = secondA - 1;
        System.out.println(secondA);
        String result1 = "";
        if (ternar(250, 5)) {
            result1 = "true";
        } else {
            result1 = "false";
        }

        ifElse(5, 5);
        System.out.println(result1);
        if (firstA > firstB) result = "true";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println(" your mounth is :" + getMonthByNumber(number));

        int[] arr = new int[number];
        System.out.println("size of entered array is: " + arr.length);
        String resultedString = "1";
        for (int numberOfCircle = 0; numberOfCircle < arr.length; numberOfCircle++) {
            arr[numberOfCircle] = numberOfCircle * 2;
            System.out.println(arr[numberOfCircle]);
        }
        System.out.println(resultedString);
        for (int numberOfCircle = 10; numberOfCircle > 0; numberOfCircle--) {
            System.out.println(numberOfCircle);
        }
        while (number > 5) {
            System.out.println("number is biger then 5");
            number--;
        }

        do {
            System.out.println("number is not 0");
            number--;
        } while (number > 0);
        System.out.println("factorial of number " + number + " is :" + getFactorial(number));
    }

    public static void ifElse(int first, int second) {
        if (first == second) {
            System.out.println(" first is equal second");
        } else if (first > second) {
            System.out.println("first is  biger then second");
        } else if (first < second) {
            System.out.println("first is not biger then second");
        } else if (first <= second) {
            System.out.println("first is not biger or equal then second");
        } else {
            System.out.println("first is  biger or equal then second");
        }
    }

    public static String getMonthByNumber(int number) {
        String result = "";
        switch (number) {
            case 1: {
                result = "January";
                break;
            }
            case 2: {
                result = "February";
                break;
            }
            case 3: {
                result = "March";
                break;
            }
            case 4: {
                result = "April";
                break;
            }
            case 5: {
                result = "May";
                break;
            }
            case 6: {
                result = "June";
                break;
            }
            case 7: {
                result = "July";
                break;
            }
            case 8: {
                result = "August";
                break;
            }
            case 9: {
                result = "September";
                break;
            }
            case 10: {
                result = "October";
                break;
            }
            case 11: {
                result = "November";
                break;
            }
            case 12: {
                result = "December";
                break;
            }
            default: {
                result = " no month exist";
            }

        }
        return result;
    }

    public static boolean ternar(int first, int second) {
        return first > second;
    }

    public static int getFactorial(int num) {
        int result = 1;
        while (num > 0) {
            result = num * result;
            num--;
        }
        return result;
    }

}
