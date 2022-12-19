package com.crud.tasks;

import java.util.Scanner;

public class AdditionalTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź pojedyńczy znak");
        String input = scanner.nextLine();

        try {
            int number = convertToInt(input);
            System.out.println("Otrzymana liczba to: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Błąd " + e.getMessage());
        }
    }

    public static int convertToInt(String input) throws NumberFormatException {
        if (input.length() != 1) {
            throw new NumberFormatException("Wprowadzono więcej niż jeden znak");
        }

        char c = input.charAt(0);
        if (!Character.isDigit(c)) {
            throw new NumberFormatException("Wprowadzono niedozwolony znak: " + c);
        }
        return Character.getNumericValue(c);
    }
}
