package TimeStamp;

import java.util.Date;
import java.util.Scanner;

public class Synchronize implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Synchronize());
        thread.start();
        /*for (int i = 0; i < 500; i++) {
            if (i == 400) {
                thread.interrupt();
            }

        }*/
       // thread.interrupt();
        Scanner scanner = new Scanner(System.in);
        String interrupt;
        interrupt = scanner.nextLine();
        /*if (interrupt.equals("stop")) {
            thread.interrupt();
        }*/
        thread.interrupt();
        System.out.println("Thread interrupted");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted()) {
            Date d = new Date();
            System.out.println(d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            i++;
            /*if (i == 5000) {
                Thread.currentThread().interrupt();
            }*/
        }

    }
}
