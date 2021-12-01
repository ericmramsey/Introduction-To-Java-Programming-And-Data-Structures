/*
    (Count characters, words, and lines in a file)
    Write a program that will count the number of characters,
    words, and lines in a file. Words are separated by whitespace characters.
    The file name should be passed as a command-line argument, as shown in Figure 12.13.

    @author: Eric Ramsey
    @version: 04/07/21
 */

import java.io.*;
import java.util.*;

public class Exercise12_13 {

    public static void main(String[] args) throws Exception {
        // Check usage
        if (args.length != 1) {
            System.out.println("Usage: java filename");
            System.exit(1);
        }

        // Check if the file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }
        // int variables used to track total of chars, words, and lines in file
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        // Opens file and tests the line and char count
        try (Scanner scanner = new Scanner(file);) {

            while (scanner.hasNext()) {
                lineCount++;
                String line = scanner.nextLine();
                charCount += line.length();
            }
        }
        // Re-opens file and tests the line and char count
        try (Scanner input = new Scanner(file);) {

            while (input.hasNext()) {
                String line = input.next();
                wordCount++;
            }
        }

        // Output the total results and file name
        System.out.println("File " + file.getName() + " has");
        System.out.println(charCount + " characters");
        System.out.println(wordCount + " words");
        System.out.println(lineCount + " lines");
    }
}
