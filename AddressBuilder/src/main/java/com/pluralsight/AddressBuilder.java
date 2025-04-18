package com.pluralsight;
import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input section asking user to enter full name, billing address
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Please enter full billing address");
        System.out.print(", enter your house number and street name: ");
        String street = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State (two letters): ");
        String state = scanner.nextLine();
        System.out.print("Zip code: ");
        String zipCode = scanner.nextLine();

        // Variables for shipping address
        String shippingStreet;
        String shippingCity;
        String shippingState;
        String shippingZip;

        // Ask if shipping is the same
        System.out.print("Is your shipping address the same as your billing address? (yes/no): ");
        String sameAddress = scanner.nextLine().toLowerCase();

        if (sameAddress.equals("yes")) {
            // Use billing info for shipping
            shippingStreet = street;
            shippingCity = city;
            shippingState = state;
            shippingZip = zipCode;

        } else {
            // Ask for shipping address
            System.out.print("Please enter full shipping address");
            System.out.print(", enter your house number and street name: ");
            shippingStreet = scanner.nextLine();
            System.out.print("City: ");
            shippingCity = scanner.nextLine();
            System.out.print("State (two letters): ");
            shippingState = scanner.nextLine();
            System.out.print("Zip code: ");
            shippingZip = scanner.nextLine();
        }

        // Build the output using StringBuilder
        StringBuilder output = new StringBuilder();
        output.append("\n").append(fullName).append("\n");
        output.append("Billing Address:".toUpperCase()).append("\n");
        output.append(street).append("\n");
        output.append(city).append(", ").append(state).append(" ").append(zipCode).append("\n");
        output.append("Shipping Address:".toUpperCase()).append("\n");
        output.append(shippingStreet).append("\n");
        output.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        // Print
        System.out.println("\nCustomer Information:\n");
        System.out.println("---------------------------------------------------");
        System.out.println(output.toString());


    }
}
