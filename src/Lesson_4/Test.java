package Lesson_4;

public class Test {
    static {
        System.out.println("Static");
    }

    {
        System.out.println("Non-static block");
    }

    public Test() {
        System.out.println("Constructor");
    }

}
