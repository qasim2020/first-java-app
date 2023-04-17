package se.salt.precourse.firstjavaapp;

import java.io.IOException;
import java.util.Scanner;

public class daysOfTheWeek {

    static String[] weekDays = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String name = listWeekDays();
        System.out.println("Your week day is: " + name);

    }

    public static String listWeekDays() throws IOException {
        int index = 0;
        do {
           System.out.println("Please enter a number between 0 and 8: ");
           index = scanner.nextInt();
        } while (!(index > 0 && index < 8));
        return weekDays[index - 1];
    }
}

