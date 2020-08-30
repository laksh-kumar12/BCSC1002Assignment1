/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] availableBooks;

    public Book[] getAvailableBooks() {
        return availableBooks.clone();
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Library() {
        this.availableBooks = new Book[50];
        for (int bookNumber = 0; bookNumber < availableBooks.length; bookNumber++) {
            availableBooks[bookNumber] = new Book("book" + bookNumber, "author" + bookNumber, "973-0-7258-514-" + bookNumber);
        }
    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }
}
