package main;
import java.io.BufferedWriter;
import java.io.File;

<<<<<<< Updated upstream
=======
import java.io.FileWriter;
import java.io.IOException;
// Importing required classes
>>>>>>> Stashed changes
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

	public void permStorage(int sNo, String bookName, String authorName, int totalQty) {
		File bookFile = new File("BookIndexes/Books.csv");
		FileWriter fw;
		try {
			fw = new FileWriter(bookFile);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(sNo + "," + bookName + "," + authorName + "," + totalQty);
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
