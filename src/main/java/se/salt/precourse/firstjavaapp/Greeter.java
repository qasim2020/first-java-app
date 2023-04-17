package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Greeter {
  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  private static String getDaysLeftInCourse(String datePassedIn) {
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      // from the class
      var scanner = new Scanner(System.in);
      LocalDate inputDate = LocalDate.parse(datePassedIn, dtf);
      LocalDateTime date1 = inputDate.atStartOfDay();
      LocalDateTime date2 = LocalDateTime.now();

      long daysBetween = Duration.between(date2, date1).toDays();

      return "Today it is " + Long.toString(daysBetween) + " days left until the course starts";
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");
    BufferedReader reader_one = new BufferedReader(new InputStreamReader(System.in));
    String name = reader_one.readLine();

    System.out.print("When does that course start? ");
    BufferedReader reader_two = new BufferedReader(new InputStreamReader(System.in));
    String startDate = reader_two.readLine();

    String greeting = greet(name);
    String daysLeftInCourse = getDaysLeftInCourse(startDate);

    System.out.println(greeting);
    System.out.println(daysLeftInCourse);

  }
}

