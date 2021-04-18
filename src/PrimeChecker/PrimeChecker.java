package PrimeChecker;

public class PrimeChecker implements Runnable {
    private long checknumber;
    private boolean isprime;

    public PrimeChecker(long checknumber) {
        this.checknumber = checknumber;
    }

    public void primechecker() {
        if (checknumber != 1) {
            isprime=true;
            for (int i = 2; i < checknumber/2; i++) {
                if (checknumber % i == 0) {
                    isprime = false;
                    break;
                }

            }

        }
        if (isprime == true) {
            System.out.println(checknumber + " ist eine Primzahl");
        } else System.out.println(checknumber + " ist keine Primzahl");


    }

    @Override
    public void run() {
        primechecker();

    }
}
