package lesson_9;

public enum Month {
    JANUARY(31, 31, -22.4, 3.2, "Январь"),
    FEBRUARY(28, 29, -26.8, 1.2, "Февраль"),
    MARCH(31, 31, -1.6, 5.2, "Март"),
    APRIL(30, 30, 10.1, 19.4, "Апрель"),
    MAY(31, 31, 20.2, 29.2, "Май"),
    JUNE(30, 30, 21.5, 33.3, "Июнь"),
    JULY(31, 31, 27.2, 35.7, "Июль"),
    AUGUST(31, 31, 25.3, 31.3, "Август"),
    SEPTEMBER(30, 30, 15.3, 28.2, "Сентябрь"),
    OCTOBER(31, 31, 10.1, 19.4, "Октябрь"),
    NOVEMBER(30, 30, 8.6, 2.6, "Ноябрь"),
    DECEMBER(31, 31, -15.3, 1.9, "Декабрь");

    private int maxDays;
    private int minDays;
    private double minTemp;
    private double maxTemp;
    private String rusName;

    Month(int maxDays, int minDays, double minTemp, double maxTemp, String rusName) {
        this.maxDays = maxDays;
        this.minDays = minDays;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.rusName = rusName;
    }

    public int getMaxDays() {
        return maxDays;
    }

    public int getMinDays() {
        return minDays;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public String getRusName() {
        return rusName;
    }

    public double getMiddleTemp() {
        return (maxTemp + minTemp) / 2;
    }

}
