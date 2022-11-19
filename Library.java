// Java Program to Illustrate Application CLass
// To Create The Menu For the Program
package main;

// Importing required classes
import java.util.Scanner;

// Class
public class Library {

	// Main driver method
	public static void main(String[] args) {
		// Creating object of Scanner class
		// to take input from user
		Scanner input = new Scanner(System.in);

		// Displaying menu
		System.out.println(
				"********************Welcome to the UWON Library!*******************");
		System.out.println(
				"				 Select From The Following Options:			 ");
		System.out.println(
				"*********************************************************************");
		
		// Creating object of Book class
		Books booksObj = new Books();
		// Creating object of Students class
		Students obStudent = new Students();

		int menuChoice;
		int choice;
		int searchChoice;

		booksObj.dispMenu();
		menuChoice = input.nextInt();
		switch (menuChoice) {
			// Case 1 Student
			case 1:
				
				// Creating menu
				// using do-while loop
				do {
					
					booksObj.dispStudentMenu();
					input.nextInt();
					choice = input.nextInt();

					// Switch case
					switch (choice) {

						case 1:

							System.out.println(
									" press 1 to Search with Book Serial No.");
							System.out.println(
									" Press 2 to Search with Book's Author Name.");
							searchChoice = input.nextInt();

							// Nested switch
							switch (searchChoice) {

								// Case
								case 1:
									booksObj.searchBySno();
									break;

								// Case
								case 2:
									booksObj.searchByAuthorName();
							}
							break;

						// Case
						case 2:
							booksObj.showAllBooks();
							break;

						

						// Case
						case 3:
							obStudent.checkOutBook(booksObj);
							break;

						// Case
						case 4:
							obStudent.checkInBook(booksObj);
							break;

						// Default case that will execute for sure
						// if above cases does not match
						default:

							// Print statement
							System.out.println("ENTER BETWEEN 0 TO 4.");
					}
					input.close();
				}

				// Checking condition at last where we are
				// checking case entered value is not zero
				while (choice != 0);
				
				break;

			// Case 2 Staff
			case 2:
				
				// Creating menu
				// using do-while loop
				do {

					booksObj.dispStaffMenu();
					input.nextInt();
					choice = input.nextInt();

					// Switch case
					switch (choice) {

						// Case
						case 1:
							Book b = new Book();
							booksObj.addBook(b);
							break;

						// Case
						case 2:
							booksObj.upgradeBookQty();
							break;

						// Case
						case 3:

							System.out.println(
									" press 1 to Search with Book Serial No.");
							System.out.println(
									" Press 2 to Search with Book's Author Name.");
							searchChoice = input.nextInt();

							// Nested switch
							switch (searchChoice) {

								// Case
								case 1:
									booksObj.searchBySno();
									break;

								// Case
								case 2:
									booksObj.searchByAuthorName();
							}
							break;

						// Case
						case 4:
							booksObj.showAllBooks();
							break;

						// Case
						case 5:
							Student s = new Student();
							obStudent.addStudent(s);
							break;

						// Case
						case 6:
							obStudent.showAllStudents();
							break;

						// Case
						case 7:
							obStudent.checkOutBook(booksObj);
							break;

						// Case
						case 8:
							obStudent.checkInBook(booksObj);
							break;

						// Default case that will execute for sure
						// if above cases does not match
						default:

							// Print statement
							System.out.println("ENTER BETWEEN 0 TO 8.");
					}
					
				}

				// Checking condition at last where we are
				// checking case entered value is not zero
				while (choice != 0);
				
				break;

			// Case 3 IT Staff
			case 3:
				
				// Creating menu
				// using do-while loop
				do {

					booksObj.dispStudentMenu();
					input.nextInt();
					choice = input.nextInt();

					// Switch case
					switch (choice) {

						// Case
						case 1:
							Book b = new Book();
							booksObj.addBook(b);
							break;

						// Case
						case 2:
							booksObj.upgradeBookQty();
							break;

						// Case
						case 3:

							System.out.println(
									" press 1 to Search with Book Serial No.");
							System.out.println(
									" Press 2 to Search with Book's Author Name.");
							searchChoice = input.nextInt();

							// Nested switch
							switch (searchChoice) {

								// Case
								case 1:
									booksObj.searchBySno();
									break;

								// Case
								case 2:
									booksObj.searchByAuthorName();
							}
							break;

						// Case
						case 4:
							booksObj.showAllBooks();
							break;

						// Case
						case 5:
							Student s = new Student();
							obStudent.addStudent(s);
							break;

						// Case
						case 6:
							obStudent.showAllStudents();
							break;

						// Case
						case 7:
							obStudent.checkOutBook(booksObj);
							break;

						// Case
						case 8:
							obStudent.checkInBook(booksObj);
							break;

						// Default case that will execute for sure
						// if above cases does not match
						default:

							// Print statement
							System.out.println("ENTER BETWEEN 0 TO 8.");
					}
					
				}

				// Checking condition at last where we are
				// checking case entered value is not zero
				while (choice != 0);
				input.close();
				break;
		}
	}
}