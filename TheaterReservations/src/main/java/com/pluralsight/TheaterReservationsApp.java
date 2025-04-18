package com.pluralsight;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TheaterReservationsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for their full name
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine().trim(); // trim() removes extra spaces at start or end

        // Ask what date they want to attend the show (MM/dd/yyyy)
        System.out.print("What date would you like to reserve (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine().trim(); // to get date as a string

        // Ask how many tickets to reserve
        System.out.print("How many tickets would you like? ");
        int ticketCount = Integer.parseInt(scanner.nextLine().trim());
        // Read line as text and convert into int using Integer.parseInt()

        // Converting the date into a proper format (yyyy-MM-dd), using LocalDate.parse
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateInput, inputFormatter); // Converts the text to real date

        // Break the full name into parts
        String[] nameParts = fullName.split(" "); // this splits the name into words using spaces as the divider
        String firstName = nameParts[0]; // the first word is first name
        String lastName = nameParts[nameParts.length - 1]; // the last word is last name

        //Print the confirmation message in the format they want
        System.out.println("Thank you, " + lastName + ", " + firstName + "! You have reserved " + ticketCount + " " + (ticketCount == 1 ? "ticket" : "tickets") + " for " + date);



    }
}
