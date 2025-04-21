package com.pluralsight;

public class WhileLoop {
    public static void main (String[] args) {
        int count = 0; // Start counter variable to keep track of how many times we printed

        while (count < 5) { // This while loop will run as long as  count is less than five
            System.out.println("I Love Java"); // Print message
            count++; // Increase the count by 1 after each print, after 5 times the loop condition becomes false
        }
        // Loop ends when count is no longer less than 5
    }
}
