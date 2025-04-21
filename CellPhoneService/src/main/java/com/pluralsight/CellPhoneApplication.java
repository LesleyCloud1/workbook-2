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

        //set the cellphone data on the object
        myPhone.setSerialNumber(Integer.parseInt(serialNumber));
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        // use the getters to display this information


        // create our new phone
        CellPhone burnerPhone = new CellPhone();
        burnerPhone.setPhoneNumber("123-456-7891");
        burnerPhone.setOwner("Lesley");

        System.out.println("---------------info for myPhone---------------");
        //use the display method instead
        display(myPhone);

        System.out.println("---------------info for burnerPhone---------------");
        //use the display method instead
        display(burnerPhone);

        // have myPhone call the burner
        myPhone.dial(burnerPhone.getPhoneNumber());

        // have the burner call myPhone
        burnerPhone.dial(myPhone.getPhoneNumber());

    }

    static void display(CellPhone phone){
        System.out.println("The phone's serial number is: " + phone.getSerialNumber());
        System.out.println("The phone's model is: " + phone.getModel());
        System.out.println("The phone's carrier is: " + phone.getCarrier());
        System.out.println("The phone's phone number is: " + phone.getPhoneNumber());
        System.out.println("The phone's owner is: " + phone.getOwner());


    }
}
