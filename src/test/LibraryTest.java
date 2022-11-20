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
}
