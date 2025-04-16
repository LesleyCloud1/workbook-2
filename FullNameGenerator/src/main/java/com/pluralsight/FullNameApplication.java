package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter their name
        System.out.println("Please enter your name");

        // Asking user to enter their first name & remove extra spaces suing trim()
        System.out.print("First Name: ");
        String firstName = scanner.nextLine().trim();

        // Asking user to enter middle name and trim too
        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine().trim();

        // Asking for last name and also trimming spaces
        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        // Asking for suffix and also trimming any spaces
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // Using StringBuilder to build the full name
        StringBuilder fullName = new StringBuilder(firstName);

        // If theres a middle name, we will add it to the full name
        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName);
        }
        // We will also add the last name
        fullName.append(" ").append(lastName);

        // If theres a suffix we will add a comma then suffix
        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        // Prints the final name
        System.out.println("Your full name is: " + fullName);

    }
}
