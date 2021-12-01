/*
    (Compute greatest common divisor using recursion) This program will
    prompt the user for two integers and will then determine the greatest
    common factor using recursion.

    @author: Eric Ramsey
    @version: 09/18/21
*/


import java.util.Scanner;

public class Exercise18_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println("The GCD of " + m + " and " + n + " is " + gcd(m, n));

    }
    // Method used for computing the gcd of two integers and will return the found value
    public static int gcd(int m, int n) {

        if (m % n == 0) {

            return n;

        } else {

            return gcd(n, m % n);

        }
    }
}
