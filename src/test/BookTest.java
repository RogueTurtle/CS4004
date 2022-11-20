package test;
import main.Book;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BookTest{
    @Test
    public void CsvWriterTest() throws IOException{
        Book book = new Book();
        book.permStorage(12345,"randBookName", "me", 1);
        File booksCsv = new File("src/BookIndexes/Books.csv");
        String line = "";
        String finalString = "";
        try {
            FileReader fr = new FileReader(booksCsv);
            BufferedReader br =new BufferedReader(fr);
            while (br.ready()) {
                line = br.readLine();
                if (line == "12345,randBookName,me,1") {
                  finalString = line;  
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }

        assertEquals("12345,randBookName,me,1", finalString);
    }
}
