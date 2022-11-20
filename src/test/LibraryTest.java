package test;

import main.Library;

import org.junit.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class LibraryTest {
    @Test
    public void MenuScannerTest() {
        Library lib = new Library();
        
    }

    @Test
    public void MenuTester(){
        try {
            Robot robot = new Robot();
            
            // Using the mouse to go through start up sequence
            // Note : that if you're using a different editor
            // You will probably have to edit the mouseMove values
            robot.mouseMove(1825,50);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            robot.mouseMove(960,80);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            robot.mouseMove(1740, 960);
            robot.delay(3000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            
            robot.mouseMove(400,1000);
            robot.delay(3000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // Now that we're in the terminal, let's add inputs
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            } catch (AWTException e) {
                e.printStackTrace();
            }
    }


    @Test
    public void StaffMenuTester(){
        try {
            Robot robot = new Robot();
            
            // Using the mouse to go through start up sequence
            // Note : That this is designed for VSCode 
            // If you're using a different IDE you will
            // probably have to edit the mouseMove values.

            robot.mouseMove(1825,50);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            robot.mouseMove(960,80);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            robot.mouseMove(1740, 960);
            robot.delay(3000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            
            robot.mouseMove(400,1000);
            robot.delay(3000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(100);

            // Going into Staff Menu
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // Testing Add a Book
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // Test Updating the Quantity
            // Adding to Book Quantity
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // + 1 book
            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // Removing a Book
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // -1 Book
            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_MINUS);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER); 

            // Testing Search a Book
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER); 
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // Testing Show All Books
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // Testing Register Student
            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_J);
            robot.keyRelease(KeyEvent.VK_J);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyRelease(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_H);
            robot.keyRelease(KeyEvent.VK_H);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // Test Show All Students
            robot.keyPress(KeyEvent.VK_6);
            robot.keyRelease(KeyEvent.VK_6);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_6);
            robot.keyRelease(KeyEvent.VK_6);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Check Out Book
            robot.keyPress(KeyEvent.VK_7);
            robot.keyRelease(KeyEvent.VK_7);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_7);
            robot.keyRelease(KeyEvent.VK_7);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Check In Book
            robot.keyPress(KeyEvent.VK_8);
            robot.keyRelease(KeyEvent.VK_8);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_8);
            robot.keyRelease(KeyEvent.VK_8);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);


        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    // Test all the Student Functionality
    @Test
    public void StudentMenuTester(){
        Library library = new Library();
        
        try {
            Robot robot = new Robot();
            
            // Using the mouse to go through start up sequence
            // Note : that if you're using a different editor
            // You will probably have to edit the mouseMove values
            robot.mouseMove(1825,50);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            robot.mouseMove(960,80);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            robot.mouseMove(1740, 960);
            robot.delay(3000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            
            robot.mouseMove(400,1000);
            robot.delay(3000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(100);

            // Now that we're in the terminal, let's add inputs
            // Picks Student Menu
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Picks Seach a Book
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // Picks Book Serial No.
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Enters Serial No.
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);


            // No Book Found

            // Back into Student Menu
            // Picks Search a Book
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Search by Author
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            // Enters Author's Name
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            // No Book Found

            // Back into Student Menu
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);

            } catch (AWTException e) {
                e.printStackTrace();
            }
    }
}
