package Lesson_2;

public class Calculation {
    double first;
    double second;

    public Calculation(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public void sum() {
        System.out.println(this.first + this.second);
    }

    public double sumReturn() {
        return this.first + this.second;
    }

    public void div() {
        System.out.println(this.first - this.second);
    }

    public double divReturn() {
        return this.first - this.second;
    }

    public void multiply() {
        System.out.println(this.first * this.second);
    }

    public double multiplyReturn() {
        return this.first * this.second;
    }

    public void share() {
        System.out.println(this.first / this.second);
    }

    public double shareReturn() {
        return this.first / this.second;
    }

    public void aliquot() {
        System.out.println(this.first % this.second);
    }

    public double aliquotReturn() {
        return this.first % this.second;
    }
}
