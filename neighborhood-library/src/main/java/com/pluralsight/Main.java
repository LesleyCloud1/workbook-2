package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create a new library instance
        Library library = new Library();

        //Display the menu to the user
        while (true) {
            System.out.println("\nWelcome to the Neighborhood Library");
            System.out.println("1. Show Available Books");
            System.out.println("2. Check Out a Book");
            System.out.println("3. Check In a Book");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //

            if (choice == 1) {
                //Show available books
                library.showAvailableBooks();
            } else if (choice == 2) {
                //Ask user for the book they want to check out
                System.out.print("Enter the book ID you want to check out (1-20): ");
                int bookId = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                library.checkOutBook(bookId, name);
            } else if (choice == 3) {
                //Ask user for the book they want to check in
                System.out.print("Enter the book ID you want to check in (1-20): ");
                int bookId = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                library.checkInBook(bookId);
            } else if (choice == 4) {
                //Exit the program
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please select again.");
            }
        }

        scanner.close();
    }
}
