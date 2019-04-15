package lesson_9;


import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException,Exception{

        try {
            System.out.println(Month.JULY);
            System.out.println(Month.APRIL.getRusName());
            System.out.println(Month.AUGUST.getMiddleTemp());
            if (Month.NOVEMBER.getMaxDays() > Month.FEBRUARY.getMaxDays()) {
                throw new MyException(303);
            } else {
                throw new MyException(404);
            }
        } catch (MyException e) {
            if (e.getCode() == 303) {
                System.out.println("sorry");
            }
            if (e.getCode() == 404) {
                System.out.println("Not found");
            }
        } catch (Throwable e){
            System.out.println(1111);
        }finally {
            System.out.println("FFFFFF");
        }
        //        int resultint = 2/0;
//        double result = (25.3 + 31.3) / 0;
//        System.out.println(result);

//        System.out.println("go");


    }
}
