package lesson_8;


public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        outer.showFlag();
    }
}
