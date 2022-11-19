// Java Program to Illustrate Student Class
// to take Input from the student and related Information
package main;
// Importing required classes
import java.util.Scanner;

// Class
public class Staff {
    
	// Class member variables
	String staffName;
	String staffIdNum;

	Book borrowedBooks[] = new Book[3];
	public int BooksCount = 0;

	// Creating object of Scanner class to
	// take input from user
	Scanner input = new Scanner(System.in);

	// Constructor
	public Staff()
	{
		// Print statement
		System.out.println("Enter Staff Name:");

		// This keywords refers to current instance
		this.staffName = input.nextLine();

		// Print statement
		System.out.println("Enter Registration Number:");
		this.staffIdNum = input.nextLine();
	}
}
