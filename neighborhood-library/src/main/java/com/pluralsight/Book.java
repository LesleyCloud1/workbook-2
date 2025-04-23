package com.pluralsight;

public class Book {
    //Class properties that describe a book
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    public Book(int id, String isbn, String title) {
        //Get values from constructor for these properties
        this.id = id;
        this.isbn = isbn;
        this.title = title;

        //Give these properties default values but dont set from the constructor
        this.setCheckedOut(false);
        this.setCheckedOutTo("");
    }

    //My custom methods

    //Method to check-out a book that sets the appropriate variables
    public void checkOut(String name){
        //set isCheckedOutto true using setter
        this.setCheckedOut(true);
        //set checkedOut to, to the name passed in
        this.setCheckedOutTo(name);
    }
    //Method to check in a book that clears the appropriate variables

    public void checkedOut(String name){


    }


    public int getId() {
        return id;
    }
    //getters and setters for all class properties
    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
