/*
    (Revise Listing 30.1)
    Rewrite Listing 30.1 to display the output in a text area, as shown in Figure 30.30.

    @author: Eric Ramsey
    @version: 11/30/21
 */

public class Exercise32_01 {

    public static void main(String[] args) {
        // Initiate runnable tasks
        Runnable printA = new PrintCharacter('a', 100, 200);
        Runnable printB = new PrintCharacter('b', 100, 100);
        Runnable print100 = new PrintNumber(100);

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}