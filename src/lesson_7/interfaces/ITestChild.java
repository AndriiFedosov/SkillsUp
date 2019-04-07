package lesson_7.interfaces;

import lesson_7.abstractClases.TestAbstract;

public class ITestChild extends TestAbstract implements Test, Seasons  {
    @Override
    public void nextSeason(int number) {

    }

    @Override
    public void previousSeason(int number) {
        System.out.println(Seasons.getSeason(number - 1));
    }

    @Override
    public String getName(int age, String name) {
        return null;
    }


    @Override
    public void getHello(String name) {

    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public void showMenu() {

    }
}
