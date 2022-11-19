// Java Program to Illustrate Students Class
// To Do all the Operations related to Students:
// add Students,check-in books,check out books,ValidStudent
package main;
import java.time.LocalDate;
// Importing required classes
import java.util.Scanner;

// Class
public class Staffs {
    // Creating objects of Scanner and Students class
	Scanner input = new Scanner(System.in);
	Staff theStaff[] = new Staff[50];

	public static int count = 0;

	// Method 1
	// To add Books
	public void addStaff(Staff t)
	{
		for (int i = 0; i < count; i++) {

			if (t.staffIdNum.equalsIgnoreCase(
					theStaff[i].staffIdNum)) {

				// Print statement
				System.out.println(
					"Staff of Id Num " + t.staffIdNum
					+ " is Already Registered.");

				return;
			}
		}

		if (count <= 50) {
			theStaff[count] = t;
			count++;
		}
	}

	// Method 2
	// Displaying all Staff
	public void showAllStaff()
	{
		// Printing Student name and
		// corresponding registered number
		System.out.println("Staff Name\t\tId Number");
		for (int i = 0; i < count; i++) {

			System.out.println(theStaff[i].staffName
							+ "\t\t"
							+ theStaff[i].staffIdNum);
		}
	}

	// Method 3
	// To check the Student
	public int isStaff()
	{
		// Display message only
		System.out.println("Enter Id Number:");

		String staffIdNum = input.nextLine();

		for (int i = 0; i < count; i++) {

			if (theStaff[i].staffIdNum.equalsIgnoreCase(
					staffIdNum)) {
				return i;
			}
		}

		// Print statements
		System.out.println("Staff Member is not Registered.");
		System.out.println("Get Registered First.");

		return -1;
	}

	// Method 4
	// To remove the Book
	public void checkOutBook(Books Book)
	{
		int StaffIndex = this.isStaff();

		if (StaffIndex != -1) {
			System.out.println("checking out");

			Book.showAllBooks();
			Book b = Book.checkOutBook();

			System.out.println("checking out");
			if (b != null) {

				if (theStaffs[StaffIndex].BooksCount
					<= 3) {

					System.out.println("adding Book");
					theStaff[StaffIndex].borrowedBooks
						[theStaff[StaffIndex]
							.BooksCount]
						= b;
					theStaff[StaffIndex].BooksCount++;
					

					return;
				}
				else {

					System.out.println(
						"Staff Can not Borrow more than 3 Books.");
					return;
				}
			}
			System.out.println("Book is not Available.");
		}
	}

	// Method 5
	// To add the Book
	public void checkInBook(Books Book)
	{
		int StaffIndex = this.isStaff();
		if (StaffIndex != -1) {

			// Printing credentials corresponding to Student
			System.out.println(
				"S.No\t\t\tBook Name\t\t\tAuthor Name");

			Staff t = theStaff[StaffIndex];

			for (int i = 0; i < s.BooksCount; i++) {

				System.out.println(
					t.borrowedBooks[i].sNo + "\t\t\t"
					+ t.borrowedBooks[i].BookName + "\t\t\t"
					+ t.borrowedBooks[i].authorName);
			}

			// Display message only
			System.out.println(
				"Enter Serial Number of Book to be Checked In:");

			int sNo = input.nextInt();

			for (int i = 0; i < s.BooksCount; i++) {
				if (sNo == s.borrowedBooks[i].sNo) {
					Book.checkInBook(s.borrowedBooks[i]);
					t.borrowedBooks[i] = null;

					return;
				}
			}

			System.out.println("Book of Serial No " + sNo
							+ "not Found");
		}
	}
	public void overdueCheck() {
		LocalDate nowDate = LocalDate.now();
		
		
	}
}
