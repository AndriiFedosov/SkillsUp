package lesson_7.interfaces;

public interface Test extends Seasons{
    String CONSTANT_FIELD = "constant";

    int getNumber();

    default void showMenu(){
        System.out.println("We can show menu");
    }

    static void goo(){
        System.out.println("we are go");
    }

}
