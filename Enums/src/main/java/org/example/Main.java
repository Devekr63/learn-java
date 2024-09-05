package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfTheWeek today = DaysOfTheWeek.WED;
        System.out.println(today);

        System.out.printf("Today is %s, %drd day of the week%n", today.name(), today.ordinal());

        System.out.println(getRandomDay());
    }

    private static DaysOfTheWeek getRandomDay(){
        int randomDay = new Random().nextInt(7);
        var daysInAWeek = DaysOfTheWeek.values();

        return daysInAWeek[randomDay];
    }
}