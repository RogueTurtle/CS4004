package main;

import java.util.Scanner;

public class Library {

	// Creating object of Book class
	Books booksObj = new Books();
	// Creating object of Students class
	Students obStudent = new Students();

	// Variables for menus
	private int menuChoice;
	private int choice;
	private int searchChoice;

	public void menu() {
		Library lib = new Library();
		
		try {

			// Scanner to take user input
			Scanner input = new Scanner(System.in);

			// Displaying menu
			System.out.println(
					"********************Welcome to the UWON Library!*******************");
			System.out.println(
					"				 Select From The Following Options:			 ");
			System.out.println(
					"*********************************************************************");
			
			booksObj.dispMenu();
			menuChoice = input.nextInt();
			
		
		// Switch for Student, Staff or Admin menus
		switch (menuChoice) {
			// Case 1 Student
			case 1:
				
				// Creating menu
				// using do-while loop
				lib.Student();
				input.close();
				break;
				

			// Case 2 Staff
			case 2:
				
				// Creating menu
				// using do-while loop
				lib.staff();
				input.close();
				break;

			// Case 3 Admin
			case 3:
				
				// Creating menu
				// using do-while loop
				lib.admin();
				input.close();
				break;
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	// Method for Student Menu
	public void Student() {
		try {
			Scanner input = new Scanner(System.in);
		do {
			
			booksObj.dispStudentMenu();
			
			choice = input.nextInt();
			
			// User chooses option
			switch (choice) {
				// Case 1 Searching for Book
				case 1:

					System.out.println(
							" press 1 to Search with Book Serial No.");
					System.out.println(
							" Press 2 to Search with Book's Author Name.");
					searchChoice = input.nextInt();

					// Nested switch to search by Sno or Author name
					switch (searchChoice) {

						// Case 1 Search by Sno
						case 1:
							booksObj.searchBySno();
							break;

						// Case 2 Search by AuthorName
						case 2:
							booksObj.searchByAuthorName();
					}
					break;

				// Case 2 Show all Books
				case 2:
					booksObj.showAllBooks();
					break;

				

				// Case 3 Check out Book
				case 3:
					obStudent.checkOutBook(booksObj);
					break;

				// Case 4 Check in Book
				case 4:
					obStudent.checkInBook(booksObj);
					break;

				// Default case that will execute if above cases does not match
				default:

					System.out.println("ENTER BETWEEN 0 TO 4.");
			}
		
			
		
		}

		// Checking case entered value is not zero
		while (choice != 0);

		input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	// Method for Staff Menu
	public void staff() {
		try {
			// Scanner for user input
			Scanner input = new Scanner(System.in);
			do {

				booksObj.dispStaffMenu();
				input.nextInt();
				choice = input.nextInt();
	
				// User chooses option
				switch (choice) {
	
					// Case 1 Add Book
					case 1:
						Book b = new Book();
						booksObj.addBook(b);
						break;
	
					// Case 2 Update Book Quantity
					case 2:
						booksObj.upgradeBookQty();
						break;
	
					// Case 3 Search for Book
					case 3:
	
						System.out.println(
								" press 1 to Search with Book Serial No.");
						System.out.println(
								" Press 2 to Search with Book's Author Name.");
						searchChoice = input.nextInt();
	
						// Nested switch
						switch (searchChoice) {
	
							// Case 1 Search by Sno
							case 1:
								booksObj.searchBySno();
								break;
	
							// Case 2 Search by AuthorName
							case 2:
								booksObj.searchByAuthorName();
						}
						break;
	
					// Case 4 Show all Books
					case 4:
						booksObj.showAllBooks();
						break;
	
					// Case 5 Add new Student
					case 5:
						Student s = new Student();
						obStudent.addStudent(s);
						break;
	
					// Case 6 Show all Students
					case 6:
						obStudent.showAllStudents();
						break;
	
					// Case 7 Check out Book
					case 7:
						obStudent.checkOutBook(booksObj);
						break;
	
					// Case 8 Check in Book
					case 8:
						obStudent.checkInBook(booksObj);
						break;
	
					// If above cases does not match
					default:
	
						System.out.println("ENTER BETWEEN 0 TO 8.");
				}
				
			}
	
			// Checking case entered value is not zero
			while (choice != 0);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Method for Admin Menu
	public void admin() {

		// Scanner for user input
		try (Scanner input = new Scanner(System.in)) {
			do {

				booksObj.dispStudentMenu();
				input.nextInt();
				choice = input.nextInt();

				// User chooses option
				switch (choice) {

					// Case 1 Add Book
					case 1:
						Book b = new Book();
						booksObj.addBook(b);
						break;

					// Case 2 Update Book Quantity
					case 2:
						booksObj.upgradeBookQty();
						break;

					// Case 3 Search for Book
					case 3:

						System.out.println(
								" press 1 to Search with Book Serial No.");
						System.out.println(
								" Press 2 to Search with Book's Author Name.");
						searchChoice = input.nextInt();

						// Nested switch
						switch (searchChoice) {

							// Case 1 Search by Sno
							case 1:
								booksObj.searchBySno();
								break;

							// Case 2 Search by AuthorName
							case 2:
								booksObj.searchByAuthorName();
						}
						break;

					// Case 4 Show all Books
					case 4:
						booksObj.showAllBooks();
						break;

					// Case 5 Add new Student
					case 5:
						Student s = new Student();
						obStudent.addStudent(s);
						break;

					// Case 6 Show all Students
					case 6:
						obStudent.showAllStudents();
						break;

					// Case 7 Check out Book
					case 7:
						obStudent.checkOutBook(booksObj);
						break;

					// Case 8 Check in Book
					case 8:
						obStudent.checkInBook(booksObj);
						break;

					// If above cases does not match
					default:

						System.out.println("ENTER BETWEEN 0 TO 8.");
				}
				
			}

			// Checking case entered value is not zero
			while (choice != 0);
		}
	}
}

