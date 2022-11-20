package main;

import java.util.Scanner;

public class Book {

	// Variables
	public int sNo;
	public String BookName;
	public String authorName;
	public int BookQty;
	public int BookQtyCopy;

	// Scanner for user input
	Scanner input = new Scanner(System.in);

	// Add Book
	public Book() {
		// Setting variables via user input
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
