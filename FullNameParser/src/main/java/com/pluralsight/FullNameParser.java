package com.pluralsight;
import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter their full name and trim spaces
        System.out.print("Please enter your full name: ");
        String input = scanner.nextLine().trim();

        // Splits full name into parts based on spaces
        String[] parts = input.split(" ");

        String firstName;
        String middleName = "(none)"; // Default value
        String lastName;

        // Check if the name has a middle name, so 2 or 3 parts
        if (parts.length == 2) {
            firstName = parts[0];
            middleName = "(none)";
            lastName = parts[1];
        } else if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            // Invalid name format
            System.out.println("Invalid name format. Please enter a name in the format: First Last or First Middle Last.");
            return;
        }

        // Print results
        System.out.println("Your full name is: " + firstName + " " + middleName + " " + lastName);
    }

}