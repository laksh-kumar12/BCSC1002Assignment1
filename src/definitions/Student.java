/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private final byte MAX_NUMBER_OF_ISSUED_BOOKS = 10;
    private String firstName;
    private String middleName;
    private String lastName;
    private long studentRollNumber;
    private int numberOfBookIssued;
    private Book[] issuedBooks;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getStudentRollNumber() {
        return studentRollNumber;
    }

    public int getNumberOfBookIssued() {
        return numberOfBookIssued;
    }

    public Book[] getBookIssued() {
        return issuedBooks.clone();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentRollNumber(long studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }

    public void setIssuedBooks(Book[] issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

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
}
