/*
    The PrintNumber task class for printing number from 1 to n for a given n

    @author: Eric Ramsey
    @version: 11/30/21
 */

class PrintNumber implements Runnable {

    private int lastNum;

    // Constructor method that takes one arg
    public PrintNumber(int n) {
        lastNum = n;
    }

    @Override
    public void run() {
        try {

            System.out.print(" 1");
            Thread.sleep(100);
            for (int i = 2; i <= lastNum; i++) {

                System.out.print(" " + i);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}