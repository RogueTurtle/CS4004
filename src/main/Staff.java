
package main;

import java.util.Scanner;

public class Staff {

    // Variables
    String staffName;
    String staffIdNum;

    Book borrowedBooks[] = new Book[3];
    public int BooksCount = 0;

    // Scanner for user input
    Scanner input = new Scanner(System.in);

    // Constructor
    public Staff() {

        System.out.println("Enter Staff Name:");

        // This keywords refers to current instance
        this.staffName = input.nextLine();

        System.out.println("Enter Staff ID Number:");
        this.staffIdNum = input.nextLine();
    }
}

