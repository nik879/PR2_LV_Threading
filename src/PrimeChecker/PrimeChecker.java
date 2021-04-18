package PrimeChecker;

public class PrimeChecker implements Runnable {
    private long checknumber;
    private boolean isprimehelper;
    private static int Primecounter;
    private ValidationState isPrime;

    public PrimeChecker(long checknumber) {
        this.checknumber = checknumber;
        isPrime=ValidationState.NotStarted;
    }

    public long getChecknumber() {
        return checknumber;
    }

    public ValidationState isPrime() {
        return isPrime;
    }

    public void primechecker() {
        //System.out.println("Starting Primechecker " + Primecounter);
        Primecounter++;
        isPrime=ValidationState.Running;
        if (checknumber != 1) {
            isprimehelper =true;
            for (int i = 2; i < checknumber/2; i++) {
                if (checknumber % i == 0) {
                    isprimehelper = false;
                    break;
                }

            }

        }
        if (isprimehelper == true) {
            isPrime = ValidationState.CompletedNumberIsPrime;
            //System.out.println(checknumber + " ist eine Primzahl");
        } else //System.out.println(checknumber + " ist keine Primzahl");
        isPrime = ValidationState.CompletedNumberIsNotPrime;


    }

    @Override
    public void run() {
        primechecker();

    }
}
