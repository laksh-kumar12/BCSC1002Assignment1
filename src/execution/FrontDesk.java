/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final byte ISSUE_BOOK = 1;
    private static final byte RETURN_BOOK = 2;
    private static final byte SHOW_ISSUED_BOOKS = 3;
    private static final byte EXIT = 4;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int studentInput;
        Library library = new Library();
        System.out.println("Please enter your First Name :");
        String firstName = scannerObject.nextLine();
        System.out.println("Please enter your Middle Name (Leave empty if you don't have one) :");
        String middleName = scannerObject.nextLine();
        System.out.println("Please enter your Last Name :");
        String lastName = scannerObject.nextLine();
        System.out.println("Please enter your Roll Number :");
        int rollNumber = scannerObject.nextInt();
        Student student = new Student(firstName, middleName, lastName, rollNumber);
        do {
            System.out.print("==========");
            System.out.print("Welcome to the Library");
            System.out.println("==========");
            System.out.println("What can I help you with?");
            System.out.println("1. Issue a book.");
            System.out.println("2. Return a book.");
            System.out.println("3. Show my issued books.");
            System.out.println("4. EXIT.");
            System.out.println("Please choose an option : ");
            studentInput = scannerObject.nextInt();
            switch (studentInput) {
                case ISSUE_BOOK:
                    if (student.canBookBeIssued()) {
                        System.out.println("Enter name of book you want to issue :");
                        scannerObject.nextLine();
                        String issueBookName = scannerObject.nextLine();
                        System.out.println("Enter name of author of the book you want to issue :");
                        String issueAuthorName = scannerObject.nextLine();
                        student.issueBook(issueBookName, issueAuthorName);
                    } else {
                        System.out.println("Return a book in order to issue a book, as you have already issued five books.");
                    }
                    break;

                case RETURN_BOOK:
                    if (student.canBookBeReturned()) {
                        System.out.println("Enter name of book you want to return :");
                        scannerObject.nextLine();
                        String returnBookName = scannerObject.nextLine();
                        System.out.println("Enter name of author of the book you want to return :");
                        String returnAuthorName = scannerObject.nextLine();
                        student.returnBook(returnBookName, returnAuthorName);
                    } else {
                        System.out.println("You have not issued any book.");
                    }
                    break;
                case SHOW_ISSUED_BOOKS:
                    student.showIssuedBooks();
                    break;
                case EXIT:
                    System.out.println("=========== Thank You ==========");
                    break;
                default:
                    System.out.println("Wrong Choice!");
            }
        } while (studentInput != EXIT);
        scannerObject.close();
    }
}
