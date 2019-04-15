package lesson_10;

public class Human<T, V> {
    private T t;
    private String name;
    private V v;

    public Human(T id, String name, V v) {
        this.t = id;
        this.name = name;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
