package com.example.homeworks;

public class HomeWork7 {

    public static void main(String[] args) {

    //Task_2
        SeasonsOfTheYear summer = SeasonsOfTheYear.SUMMER;
        System.out.println("My favorite season is " + summer + ". Average temperature is " + summer.getAverageTemperature() + ", "
                + getDescription(summer));

    //Task_7
        for(SeasonsOfTheYear season: SeasonsOfTheYear.values() ){
            System.out.println("It's " + season + ". Average temperature is " + season.getAverageTemperature() + ", "
                    + getDescription(season));
        }
    }

    //Task_1 and Task_4
    enum SeasonsOfTheYear {
        WINTER("-12"),
        SPRING("+8"),
        SUMMER("+21"),
        AUTUMN("+10");

    //Task_5
        private final String averageTemperature;

        SeasonsOfTheYear(String averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public String getAverageTemperature() {
            return averageTemperature;
        }
    }

    //Task_3
    public static void seasonOfTheYear(SeasonsOfTheYear seasonsOfTheYear) {
        switch (seasonsOfTheYear) {
            case WINTER:
                System.out.println("I like winter!");
                break;
            case SPRING:
                System.out.println("I like spring!");
                break;
            case SUMMER:
                System.out.println("I like summer!");
                break;
            case AUTUMN:
                System.out.println("I like autumn!");
                break;
        }
    }

    //Task_6
        public static String getDescription(SeasonsOfTheYear seasonsOfTheYear){
            if(seasonsOfTheYear == SeasonsOfTheYear.SUMMER){
            return "warm season, nice;)";
            }
            return "cold season, brr...";
        }
}
