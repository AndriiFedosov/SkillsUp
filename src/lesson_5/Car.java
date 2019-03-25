package lesson_5;

import java.util.Arrays;
import java.util.Objects;

public class Car extends Agregat {
    private String mark;
    private String model;
    private Engine engine;
    private Passager[] passagers;
    private int capacity;

    public Car(int wight, String type, String countryOfCreate,
               String mark, String model, Engine engine, Passager[] passagers, int capacity) {
        super(wight, type, countryOfCreate);
        this.mark = mark;
        this.model = model;
        this.engine = engine;
        this.passagers = passagers;
        this.capacity = capacity;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Passager[] getPassagers() {
        return passagers;
    }

    public void setPassagers(Passager[] passagers) {
        this.passagers = passagers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return capacity == car.capacity &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Arrays.equals(passagers, car.passagers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mark, model, engine, capacity);
        result = 31 * result + Arrays.hashCode(passagers);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", passagers=" + Arrays.toString(passagers) +
                ", capacity=" + capacity +
                '}';
    }
}
