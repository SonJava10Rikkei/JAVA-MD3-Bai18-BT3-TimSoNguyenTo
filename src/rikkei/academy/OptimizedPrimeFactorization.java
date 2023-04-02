package rikkei.academy;

public class OptimizedPrimeFactorization implements Runnable {
    private int number;

    public OptimizedPrimeFactorization(int number) {
        this.number = number;
    }

    private boolean checkPrime(int number) {
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        try {
            boolean checkPrime = checkPrime(number);
            if (checkPrime) {
                System.out.println(number + " is Prime Number - Optimized !");
            } else {
                System.out.println(number + " is Not Prime Number - Optimized !");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
