package se.salt.precourse.firstjavaapp;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.util.Collections;
import java.util.stream.Collectors;

public class countNumbersInString {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter something: ");
        String string = scanner.nextLine();
        // System.out.println( countString(string) );
        System.out.println( reverseString(string) );
    }
    public static int countString(String input) {
        int length = input.length();
        return length;
    }

    public static String reverseString(String input) {
        ArrayList<String> temp = new ArrayList<>(Arrays.asList( input.split("")));
        ArrayList<String> reverse = new ArrayList<>();
        for (Integer i = 0; i < temp.size() ; i++) {
            reverse.add( i , temp.get( temp.size() - i - 1));
        }
        String output = reverse.stream().map( e -> e.toString() ).collect(Collectors.joining(""));
        return output;
    }

}