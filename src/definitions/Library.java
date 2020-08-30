/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBooks;

    public Book[] getAvailableBooks() {
        return availableBooks.clone();
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Library() {
        byte MAX_NUMBER_OF_BOOKS_IN_LIBRARY = 100;
        this.availableBooks = new Book[MAX_NUMBER_OF_BOOKS_IN_LIBRARY];
        for (int bookNumber = 0; bookNumber < availableBooks.length; bookNumber++) {
            availableBooks[bookNumber] = new Book("book" + bookNumber, "author" + bookNumber, "973-0-7258-514-" + bookNumber);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBooks=" + Arrays.toString(availableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(availableBooks, library.availableBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(availableBooks);
    }
}
