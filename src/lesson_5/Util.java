package lesson_5;

public class Util {

    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, double second) {
        return first + (int) second;
    }

    public String add(int first, String second) {
        return String.valueOf(first + Integer.valueOf(second));
    }

    public boolean isInteger(Object object){
        return object instanceof Integer;
    }
}
