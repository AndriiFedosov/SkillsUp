package lesson_7.interfaces;

public interface Seasons {
    Integer SEASON_COUNT = 4;
    String WINTER = "Winter";
    String SUMMER = "Summer";
    String SPRING = "Spring";
    String AUTUMN = "Autumn";

    static String getSeason(int number) {
        String season = "";
        switch (number) {
            case 1: {
                season = WINTER;
                break;
            }
            case 2: {
                season = SPRING;
                break;
            }
            case 3: {
                season = SUMMER;
                break;
            }
            case 4: {
                season = AUTUMN;
                break;
            }
            default:
                season = "Wrong number of season";
        }
        return season;
    }

    default void nextSeason(int number) {
        System.out.println(getSeason(number + 1));
    }
//хочу есть
    void previousSeason(int number);


    /**
     * This method return entity of your client by name and age.
     *
     * @param age age of client
     * @param name name of client
     * @return entity of client
     */
    String getName(int age ,String name);
}
