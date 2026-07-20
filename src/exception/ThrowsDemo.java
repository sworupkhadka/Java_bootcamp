package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

    public static void main(String[] args) {
        try {
            ThrowsDemo.readfile();          // Call method that may throw exceptions
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); // File not found
        } catch (IOException e) {
            e.printStackTrace();            // Other I/O error
        }
    }

    static void readfile() throws FileNotFoundException, IOException {

        FileReader f = new FileReader("C:/test.txt"); // Opens file (throws FileNotFoundException if missing)

        f.read();                                     // Reads one character (may throw IOException)

        f.close();                                    // Closes the file
    }
}