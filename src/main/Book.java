// Java Program to Illustrate Book Class that
// takes Input from the Books and related information

package main;

// Importing required classes
import java.util.Scanner;

// Class
public class Book {

	// Class data members
	public int sNo;
	public String BookName;
	public String authorName;
	public int BookQty;
	public int BookQtyCopy;

	// Creating object of Scanner class to
	// read input from users
	Scanner input = new Scanner(System.in);

	// Method
	// To add Book details
	public Book()
	{
		// Display message for taking input later
		// taking input via
		// nextInt() and nextLine() standard methods
		System.out.println("Enter Serial No of Book:");
		this.sNo = input.nextInt();
		input.nextLine();

		System.out.println("Enter Book Name:");
		this.BookName = input.nextLine();

		System.out.println("Enter Author Name:");
		this.authorName = input.nextLine();

		System.out.println("Enter Quantity of Books:");
		this.BookQty = input.nextInt();
		BookQtyCopy = this.BookQty;
	}
}
