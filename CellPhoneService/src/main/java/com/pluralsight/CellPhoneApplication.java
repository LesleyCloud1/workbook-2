package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

  static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Create cellphone
        CellPhone myPhone = new CellPhone();


        // ask the user for the cellphone data
        System.out.println("Enter the serial number: ");
        String serialNumber = theScanner.nextLine();

        System.out.println("Enter the model: ");
        String model = theScanner.nextLine();

        System.out.println("Enter the carrier: ");
        String carrier = theScanner.nextLine();

        System.out.println("Enter the phone number: ");
        String phoneNumber = theScanner.nextLine();

        System.out.println("Enter the owner name: ");
        String owner = theScanner.nextLine();

        // set the cellphone data on the object
        myPhone.setSerialNumber(Integer.parseInt(serialNumber));
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        // use the getters to display this information
        System.out.println("The phone's serial number is: " + myPhone.getSerialNumber());
        System.out.println("The phone's model is: " + myPhone.getModel());
        System.out.println("The phone's carrier is: " + myPhone.getCarrier());
        System.out.println("The phone's phone number is: " + myPhone.getPhoneNumber());
        System.out.println("The phone's owner is: " + myPhone.getOwner());
    }
}
