package main;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Uwon {
    
    public ArrayList<String> readBookList(String path) {
        ArrayList<String> al = new ArrayList<String>();
        String filePath = new File("").getAbsolutePath();
        filePath.concat(path);
        Scanner sc = new Scanner(filePath);
        sc.useDelimiter("\n");
        while (sc.hasNextLine()) {
            al.add(sc.next());
        }
        sc.close();

        return al;
    }


}
