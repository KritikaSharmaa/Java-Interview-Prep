package ExceptionHandling;

import java.io.*;

// Q2. File Handling with Exceptions
// Write a program to read a text file "input.txt" and print the first line.
// If the file does not exist, handle FileNotFoundException.
// If there’s an I/O error, handle IOException.
// Always print "Execution completed" in a finally block.

public class Ques2 {
    public static void main(String[] args) {
        String filePath = "input.txt";
                try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("I/O error occurred: " + e.getMessage());    
        }
    }
}
