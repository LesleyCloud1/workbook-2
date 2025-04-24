package com.pluralsight;

public class Library {
    private Book[] books; //Array to hold the books

    //Constructor to initialize the library with 20 books
    public Library() {
        books = new Book[20]; //Create an array for 20 books
        //Initialize books with unique titles and ISBNs
        books[0] = new Book(1, "978-0-670-81302-7", "Pride and Prejudice", false, "");
        books[1] = new Book(2, "978-1-59448-181-8", "Little Women", false, "");
        books[2] = new Book(3, "978-0-06-112241-5", "The Hunger Games", false, "");
        books[3] = new Book(4, "978-1-250-16767-9", "The Help", false, "");
        books[4] = new Book(5, "978-1-4472-0603-4", "Jane Eyre", false, "");
        books[5] = new Book(6, "978-0-525-95135-2", "Outlander", false, "");
        books[6] = new Book(7, "978-1-4516-4852-7", "The Fault in Our Stars", false, "");
        books[7] = new Book(8, "978-0-451-45784-6", "The Notebook", false, "");
        books[8] = new Book(9, "978-1-250-16113-4", "The Rosie Project", false, "");
        books[9] = new Book(10, "978-0-14-303809-2", "Wuthering Heights", false, "");
        books[10] = new Book(11, "978-0-553-37968-1", "The Great Gatsby", false, "");
        books[11] = new Book(12, "978-0-14-303909-9", "Sense and Sensibility", false, "");
        books[12] = new Book(13, "978-1-250-02194-6", "The Nightingale", false, "");
        books[13] = new Book(14, "978-0-345-52698-7", "The Time Traveler's Wife", false, "");
        books[14] = new Book(15, "978-0-14-144125-5", "Persuasion", false, "");
        books[15] = new Book(16, "978-1-4767-9040-8", "Before We Were Strangers", false, "");
        books[16] = new Book(17, "978-0-307-26646-6", "The Girl on the Train", false, "");
        books[17] = new Book(18, "978-1-4000-7670-0", "The Secret Life of Bees", false, "");
        books[18] = new Book(19, "978-1-5011-1102-7", "Big Little Lies", false, "");
        books[19] = new Book(20, "978-1-5011-4357-9", "Eleanor Oliphant Is Completely Fine", false, "");
    }

    //Method to display available books
    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < books.length; i++) {
            if (!books[i].isCheckedOut()) {
                System.out.println((i + 1) + ". " + books[i].getTitle()); //Display the index + 1 (human-readable number)
            }
        }
    }

    //Method to check out a book by its ID (1-based index)
    public void checkOutBook(int bookId, String name) {
        if (bookId >= 1 && bookId <= books.length) {
            Book book = books[bookId - 1]; //Convert to 0-based index
            if (!book.isCheckedOut()) {
                book.checkOut(name); //Check out the book
                System.out.println(name + " has checked out " + book.getTitle());
            } else {
                System.out.println(book.getTitle() + " is already checked out.");
            }
        } else {
            System.out.println("Invalid book ID.");
        }
    }

    //Method to check in a book by its ID (1-based index)
    public void checkInBook(int bookId) {
        if (bookId >= 1 && bookId <= books.length) {
            Book book = books[bookId - 1]; //Convert to 0-based index
            book.checkIn(); //Check in the book
        } else {
            System.out.println("Invalid book ID.");
        }
    }
}
