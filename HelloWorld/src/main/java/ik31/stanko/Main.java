package ik31.stanko;

import ik31.stanko.factorial.FactorialUtil;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static void main(String[] args) {
        System.out.println("HELLo World!");
        System.out.println("Please, enter your name: ");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
        int length = username.length();
        System.out.println("Your name has " + length + " letters. " + length + "!"
                + " = " + FactorialUtil.calculateFactorial(length));

        System.out.println("Please, enter your birth date in format (DD.MM.YYYY): ");
        String birthDateString = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateString, formatter);
        LocalDate currentDate = LocalDate.now();
        Period userPeriod = Period.between(birthDate, currentDate);
        long daysAge = ChronoUnit.DAYS.between(birthDate, currentDate);
        System.out.println("Today is " + currentDate.format(formatter) + ", you are "
                + userPeriod.getYears() + " years (" + (int) daysAge + " days) old");

        scanner.close();
    }
}
