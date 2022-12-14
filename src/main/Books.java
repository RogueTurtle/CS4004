package main;

import java.util.Scanner;

public class Books {

	// n defines size of book array
	int n = 50;
	Book theBooks[] = new Book[n];
	public static int count;

	// Scanner for user input
	Scanner input = new Scanner(System.in);

	// Method to compare books
	public int compareBookObjects(Book b1, Book b2) {

		// If the book name matches
		if (b1.BookName.equalsIgnoreCase(b2.BookName)) {

			// Printing Book exists
			System.out.println(
					"Book of this Name Already Exists.");
			return 0;
		}

		// If the serial number matches
		if (b1.sNo == b2.sNo) {

			// Print Book exists
			System.out.println(
					"Book of this Serial No Already Exists.");

			return 0;
		}
		return 1;
	}

	// Method to add books
	public void addBook(Book b) {
		// Make sure we're not adding duplicate books
		for (int i = 0; i < count; i++) {

			if (this.compareBookObjects(b, this.theBooks[i]) == 0)
				return;
		}

		// If there's space add the book
		if (count < n) {

			theBooks[count] = b;
			count++;
		}

		// If there's not enough space
		else {

			// We make the array bigger
			n = n * 2;

			// Try to add the book again
			for (int i = 0; i < count; i++) {

				if (this.compareBookObjects(b, this.theBooks[i]) == 0)
					return;
			}

			if (count < n) {

				theBooks[count] = b;
				count++;
			}
		}
	}

	// Method to search books by serial number
	public void searchBySno() {

		// Display message
		System.out.println(
				"\t\t\t\tSEARCH BY SERIAL NUMBER\n");

		// Variables
		int sNo;
		System.out.println("Enter Serial No of Book:");
		sNo = input.nextInt();

		int flag = 0;
		
		System.out.println(
				"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {
			if (sNo == theBooks[i].sNo) {
				System.out.println(
						theBooks[i].sNo + "\t\t"
								+ theBooks[i].BookName + "\t\t"
								+ theBooks[i].authorName + "\t\t"
								+ theBooks[i].BookQtyCopy + "\t\t"
								+ theBooks[i].BookQty);
				flag++;
				return;
			}
		}
		// If no serial number is found
		if (flag == 0)
			System.out.println("No Book for Serial No: "+ sNo + " Found.");
	}

	// Method to search author by name
	public void searchByAuthorName() {

		// Display message
		System.out.println(
				"\t\t\t\tSEARCH BY AUTHOR'S NAME");

		input.nextLine();

		System.out.println("Enter Author Name:");
		String authorName = input.nextLine();

		int flag = 0;

		System.out.println(
				"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			// If the author matches any of its Book
			if (authorName.equalsIgnoreCase(
					theBooks[i].authorName)) {

				// Print the corresponding book details
				System.out.println(
						theBooks[i].sNo + "\t\t"
								+ theBooks[i].BookName + "\t\t"
								+ theBooks[i].authorName + "\t\t"
								+ theBooks[i].BookQtyCopy + "\t\t"
								+ theBooks[i].BookQty);
				flag++;
			}
		}

		// If no Book matches for author name
		if (flag == 0)
			System.out.println("No Books of " + authorName
					+ " Found.");
	}

	// Method to display all Books
	public void showAllBooks() {

		System.out.println("\t\t\t\tSHOWING ALL BookS\n");
		System.out.println(
				"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			System.out.println(
					theBooks[i].sNo + "\t\t"
							+ theBooks[i].BookName + "\t\t"
							+ theBooks[i].authorName + "\t\t"
							+ theBooks[i].BookQtyCopy + "\t\t"
							+ theBooks[i].BookQty);
		}
	}

	// Method to edit the Book Quantity
	public void upgradeBookQty() {

		System.out.println(
				"\t\t\t\tUPGRADE QUANTITY OF A Book\n");
		System.out.println("Enter Serial No of Book");

		int sNo = input.nextInt();

		for (int i = 0; i < count; i++) {

			if (sNo == theBooks[i].sNo) {

				// Display message
				System.out.println(
						"Enter No of Books to be Added:");

				int addingQty = input.nextInt();
				theBooks[i].BookQty += addingQty;
				theBooks[i].BookQtyCopy += addingQty;

				return;
			}
		}
	}

	// Method to create menu
	public void dispMenu() {
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.println("Are you a student, staff or an admin?");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("Press 0 to Exit Application.");
		System.out.println("Press 1 if you are a Student.");
		System.out.println("Press 2 if you are Staff");
		System.out.println("Press 3 if you are and Admin");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
	}

	public void dispStudentMenu() {
		// Student Menu
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.println("Press 0 to Exit Application.");
		System.out.println("Press 1 to Search a Book.");
		System.out.println("Press 2 to Show All Books.");
		System.out.println("Press 3 to Check Out Book.");
		System.out.println("Press 4 to Check In Book");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
	}

	public void dispStaffMenu() {
		// Staff Menu
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.println("Press 0 to Exit Application.");
		System.out.println("Press 1 to Add new Book.");
		System.out.println("Press 2 to Upgrade Quantity of a Book.");
		System.out.println("Press 3 to Search a Book.");
		System.out.println("Press 4 to Show All Books.");
		System.out.println("Press 5 to Register Student.");
		System.out.println("Press 6 to Show All Registered Students.");
		System.out.println("Press 7 to Check Out Book. ");
		System.out.println("Press 8 to Check In Book");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
	}

	public void dispAdminMenu() {
		// Admin Menu
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.println("Press 0 to Exit Application.");
		System.out.println("Press 1 to Add new Book.");
		System.out.println("Press 2 to Upgrade Quantity of a Book.");
		System.out.println("Press 3 to Search a Book.");
		System.out.println("Press 4 to Show All Books.");
		System.out.println("Press 5 to Register Student.");
		System.out.println("Press 6 to Show All Registered Students.");
		System.out.println("Press 7 to Check Out Book. ");
		System.out.println("Press 8 to Check In Book");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
	}
	
	// Method to search the library
	public int isAvailable(int sNo) {

		for (int i = 0; i < count; i++) {
			if (sNo == theBooks[i].sNo) {
				if (theBooks[i].BookQtyCopy > 0) {

					System.out.println(
							"Book is Available.");
					return i;
				}
				System.out.println("Book is Unavailable");
				return -1;
			}
		}

		System.out.println("No Book of Serial Number " + " Available in Library.");
		return -1;
	}

	// Method to check out the Book from the library
	public Book checkOutBook() {

		System.out.println(
				"Enter Serial No of Book to be Checked Out.");
		int sNo = input.nextInt();

		int BookIndex = isAvailable(sNo);

		if (BookIndex != -1) {
			theBooks[BookIndex].BookQtyCopy--;
			return theBooks[BookIndex];
		}
		return null;
	}

	// Method to check in the Book to the Library
	public void checkInBook(Book b) {
		for (int i = 0; i < count; i++) {
			if (b.equals(theBooks[i])) {
				theBooks[i].BookQtyCopy++;
				return;
			}
		}
	}
}
