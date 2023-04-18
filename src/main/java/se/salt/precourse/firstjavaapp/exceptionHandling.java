package se.salt.precourse.firstjavaapp;

public class exceptionHandling {
    public static void main(String[] args) {
        try {
            int c = 30/0;
        } catch (Exception e) {
            System.out.println("Division is fun");
        } finally {
            System.out.println("The assignment as ended");
        }
    }
}
