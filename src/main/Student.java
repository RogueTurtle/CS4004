
package main;

import java.util.Scanner;

public class Student {

	// Variables
	String studentName;
	String studentIdNum;

	// Array of Book object for borrowed Books
	Book borrowedBooks[] = new Book[3];
	public int BooksCount = 0;

	// Scanner for user input
	Scanner input = new Scanner(System.in);

	// Constructor
	public Student() {
		System.out.println("Enter Student Name:");

		// This keywords refers to current instance
		this.studentName = input.nextLine();

		System.out.println("Enter Registration Number:");
		this.studentIdNum = input.nextLine();
	}
}
