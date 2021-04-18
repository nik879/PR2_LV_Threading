package PrimeChecker;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        PrimeChecker pc = new PrimeChecker(1979990039);
        PrimeChecker pc1 = new PrimeChecker(1991999993);
        PrimeChecker pc2 = new PrimeChecker(1891999943);
        PrimeChecker pc3 = new PrimeChecker(1891999939);
        PrimeChecker pc4 = new PrimeChecker(1991990059);
        PrimeChecker pc5 = new PrimeChecker(1989990047);
        Thread t1 = new Thread(pc);
        Thread t2 = new Thread(pc1);
        Thread t3 = new Thread(pc2);
        Thread t4 = new Thread(pc3);
        Thread t5 = new Thread(pc4);
        Thread t6 = new Thread(pc5);
        System.out.println("Starting Threads");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        System.out.println("Waiting to join Threads");
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        System.out.println("Threads are Joined");
        System.out.println(pc1.getChecknumber()+"="+pc1.isPrime());
        System.out.println(pc2.getChecknumber()+"0"+pc2.isPrime());

    }



}
