package PrimeChecker;

public class Demo {
    public static void main(String[] args) {
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
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();



    }



}
