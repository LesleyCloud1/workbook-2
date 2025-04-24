package com.pluralsight;
public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //Constructor with book details
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut; // Set whether the book is checked out
        this.checkedOutTo = checkedOutTo; // Set the person who has checked it out (or empty if not checked out)
    }

    //Getter for id
    public int getId() {
        return id;
    }

    //Setter for id
    public void setId(int id) {
        this.id = id;
    }

    //Getter for ISBN
    public String getIsbn() {
        return isbn;
    }

    //Setter for ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //Getter for Title
    public String getTitle() {
        return title;
    }

    //Setter for Title
    public void setTitle(String title) {
        this.title = title;
    }

    //Getter for isCheckedOut
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    //Setter for isCheckedOut
    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    //Getter for checkedOutTo
    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    //Setter for checkedOutTo
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    //Method to check out a book
    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }

    //Method to check in a book
    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }
}
