package Counter;

public class Counter implements Runnable{
    static int counter,counter2;
    public static Object LockObject = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new Counter());


        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
        System.out.println(counter2);

    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            increase();

            //System.out.println(i);
        }

    }

    private void increase() {
        synchronized (LockObject) {
            counter++;
        }
        counter2++;
    }
}
