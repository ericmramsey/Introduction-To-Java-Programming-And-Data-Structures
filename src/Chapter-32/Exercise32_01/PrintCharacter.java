/*
    PrintCharacter class that uses specified character and number of times to print the
    characterThe task for printing a specified character in specified times

    @author: Eric Ramsey
    @version: 11/30/21
 */

public class PrintCharacter implements Runnable {

    private char charToPrint; // The character to print
    private int times; // The times to repeat
    private int ms;

    // Construct a task with specified character and number of times to print the character
    public PrintCharacter(char c, int t, int ms) {
        charToPrint = c;
        times = t;
        this.ms = ms;
    }

    @Override
    // Override the run() method that determines which task to perform
    public void run() {
        try {
            Thread.sleep(50);
            System.out.print(charToPrint);
            Thread.sleep(ms);
            for (int i = 1; i < times; i++) {
                System.out.print(charToPrint);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}