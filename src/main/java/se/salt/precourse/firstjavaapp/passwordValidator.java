package se.salt.precourse.firstjavaapp;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordValidator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String string = "";
        System.out.println("Please enter your password");
        do {
            string = scanner.nextLine();
        } while( validatePassword(string) );
        System.out.println("Good password! Congratulations.");
    }

    public static Boolean validatePassword(String input) {
        int length = input.length();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(input.split("")) );

        if (length < 9) {
            System.out.println("Please enter a password that is greater than 8 digits");
            return true;
        }

        // 1. Must contain uppercase letter(s)
        Boolean allUpperCase;
        allUpperCase = arrayList.stream().anyMatch( v -> {
            return Character.isUpperCase(v.charAt(0));
        });

        if (!(allUpperCase)) {
            System.out.println("Please enter a password that has few upper case characters also!");
            return true;
        }

        // 2. must contain special character
        Boolean containsSpecChar;
        containsSpecChar = arrayList.stream().anyMatch( v -> {
            return !( Character.isLetterOrDigit(v.charAt(0)) );
        });

        if (!(containsSpecChar)) {
            System.out.println("Please enter a special character in the password");
            return true;
        }

        // 3. not contain a username
        Boolean notUsername;
        Pattern pattern = Pattern.compile("Qasim");
        Matcher matcher = pattern.matcher(input);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Your username matches 'Qasim', try a password that does not contain your username");
            return true;
        }

        // 4. does not match old password
        Boolean matchOldPassword;
        matchOldPassword = input.compareTo("old_password") == 0;
        if (matchOldPassword) {
            System.out.println("Password matches 'old_password', try a different password");
            return true;
        }

        return false;

    }

}