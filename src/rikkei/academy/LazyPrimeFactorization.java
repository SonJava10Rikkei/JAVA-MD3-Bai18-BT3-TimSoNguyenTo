package rikkei.academy;

public class LazyPrimeFactorization implements Runnable {
    private Thread t;
    private int number;

    public LazyPrimeFactorization(int number) {
        this.number=number;
    }

    public Thread getT() {
        return t;
    }

    @Override
    public void run() {
        try {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(number + " is a Prime number - Lazy");
            } else {
                System.out.println(number + " is NOT a Prime number - Lazy");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}
