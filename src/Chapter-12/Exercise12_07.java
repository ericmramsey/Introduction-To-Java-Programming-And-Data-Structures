/*
    (NumberFormatException)
    Write the bin2Dec(String binaryString)
    method to convert a binary string into a decimal number.
    Implement the bin2Dec method to throw a NumberFormatException
    if the string is not a binary string.

    @author: Eric Ramsey
    @version: 03/30/21
 */

import java.util.Scanner;

public class Exercise12_07 {

    public static void main(String[] args) {

        // Initialize Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary number: "); // Prompt user for input
        String userInput = scanner.nextLine(); // Store user input in userInput variable

        try {

            System.out.println(bin2Dec(userInput));

        } catch (NumberFormatException ex) {

            System.out.println("Not a binary number: " + userInput);

        }

    }
    // Method used to determine if the user input is a binary string and throws a NumberFormatException
    public static int bin2Dec(String binaryString) throws NumberFormatException {

        int decimal = 0;

        for (int i = 0; i < binaryString.length(); i++) {

            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1') {

                throw new NumberFormatException(("Not a binary number"));

            }
            decimal += (binaryString.charAt(i) - '0') * Math.pow(2, binaryString.length() - 1- i);
        }

        return decimal;
    }
}
