/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private static final byte MAX_NUMBER_OF_ISSUED_BOOKS = 5;
    private String firstName;
    private String middleName;
    private String lastName;
    private long studentRollNumber;
    private int numberOfBookIssued;
    private Book[] issuedBooks;

    public Student(String firstName, String middleName, String lastName, long studentRollNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.studentRollNumber = studentRollNumber;
        this.numberOfBookIssued = 0;
        this.issuedBooks = new Book[MAX_NUMBER_OF_ISSUED_BOOKS];
    }

    public Student(String firstName, String lastName, long studentRollNumber) {
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
        this.studentRollNumber = studentRollNumber;
        this.numberOfBookIssued = 0;
        this.issuedBooks = new Book[MAX_NUMBER_OF_ISSUED_BOOKS];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(long studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }

    public Book[] getBookIssued() {
        return issuedBooks.clone();
    }

    public void setIssuedBooks(Book[] issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentRollNumber=" + studentRollNumber +
                ", numberOfBookIssued=" + numberOfBookIssued +
                ", issuedBooks=" + Arrays.toString(issuedBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentRollNumber == student.studentRollNumber &&
                numberOfBookIssued == student.numberOfBookIssued &&
                firstName.equals(student.firstName) &&
                middleName.equals(student.middleName) &&
                lastName.equals(student.lastName) &&
                Arrays.equals(issuedBooks, student.issuedBooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, middleName, lastName, studentRollNumber, numberOfBookIssued);
        result = 31 * result + Arrays.hashCode(issuedBooks);
        return result;
    }

    /**
     * This method issues a book for the Student.
     *
     * @param bookName   The name of the book to be issued.
     * @param authorName The name of author of the book to be issued.
     */
    public void issueBook(String bookName, String authorName) {
        if (numberOfBookIssued == MAX_NUMBER_OF_ISSUED_BOOKS) {
            System.out.println("You have already issued 5 books. Please return at least 1 book in order to issue a new book.");
        } else {
            System.out.println("Your book has been issued.");
            numberOfBookIssued++;
        }
    }

    /**
     * This method returns a book which was issued by the Student.
     *
     * @param bookName   The name of the book to be returned.
     * @param authorName The name of author of the book to be issued.
     */
    public void returnBook(String bookName, String authorName) {
        System.out.println("Your book has been returned.");
        numberOfBookIssued--;
    }
}
