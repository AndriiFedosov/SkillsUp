package lesson_5;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("black", 30);
//        animal.voice();
//        Cat cat = new Cat("white", 30,8,12.2);
//        cat.voice();
//        cat.getColor();
//        Util util = new Util();
//        System.out.println(util.add(1, 2.0));
//        System.out.println(util.add(1, 3));
//        System.out.println(util.add(2, "3"));
//        System.out.println(util.isInteger(cat.getAge()));
//        Integer integer = new Integer(5);
//        Double doubleOne = 2.5;
        Car car = new Car(2000, "Auto", "Japan", "Toyota", "Capry", new Engine(150, 600), new Passager[3], 4);
        car.getEngine().start();
        Passager passager = new Passager("Andy", 20);
        Passager passager2 = new Passager("KimChenIn", 20);
        Passager passager3 = new Passager("Donald", 20);
        car = passager.sitInCar(car, passager);
        car = passager2.sitInCar(car, passager2);
        car = passager3.sitInCar(car, passager3);
        System.out.println(car.toString());


    }

}
