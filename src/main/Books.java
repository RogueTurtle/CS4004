// Java Program to Illustrate Books class
// To Do all the Operations related to Books such as
// add, check-in, check-out,Valid Books,Update Books
package main;

// Importing required classes
import java.util.Scanner;

// CLass
public class Books {

	int n = 50;
	// Class data members
	Book theBooks[] = new Book[n];
	public static int count;

	Scanner input = new Scanner(System.in);

	// Method 1
	// To compare Books
	public int compareBookObjects(Book b1, Book b2) {

		// If Book name matches
		if (b1.BookName.equalsIgnoreCase(b2.BookName)) {

			// Printing Book exists
			System.out.println(
					"Book of this Name Already Exists.");
			return 0;
		}

		// if Book serial matches
		if (b1.sNo == b2.sNo) {

			// Print Book exists
			System.out.println(
					"Book of this Serial No Already Exists.");

			return 0;
		}
		return 1;
	}

	// Method 2
	// To add Book
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

	// Method 3
	// To search Book by serial number
	public void searchBySno() {

		// Display message
		System.out.println(
				"\t\t\t\tSEARCH BY SERIAL NUMBER\n");

		// Class data members
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
		if (flag == 0)
			System.out.println("No Book for Serial No "
					+ sNo + " Found.");
	}

	// Method 4
	// To search author by name
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

			// if author matches any of its Book
			if (authorName.equalsIgnoreCase(
					theBooks[i].authorName)) {

				// Print below corresponding credentials
				System.out.println(
						theBooks[i].sNo + "\t\t"
								+ theBooks[i].BookName + "\t\t"
								+ theBooks[i].authorName + "\t\t"
								+ theBooks[i].BookQtyCopy + "\t\t"
								+ theBooks[i].BookQty);
				flag++;
			}
		}

		// Else no Book matches for author
		if (flag == 0)
			System.out.println("No Books of " + authorName
					+ " Found.");
	}

	// Method 5
	// To display all Books
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

	// Method 6
	// To edit the Book
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

	// Method 7
	// To create menu
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

		// Displaying menu
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
		// Displaying menu
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

		// Displaying menu
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
	
	// Method 8
	// To search the library
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

		System.out.println("No Book of Serial Number "
				+ " Available in Library.");
		return -1;
	}

	// Method 9
	// To remove the Book from the library
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

	// Method 10
	// To add the Book to the Library
	public void checkInBook(Book b) {
		for (int i = 0; i < count; i++) {
			if (b.equals(theBooks[i])) {
				theBooks[i].BookQtyCopy++;
				return;
			}
		}
	}
}
