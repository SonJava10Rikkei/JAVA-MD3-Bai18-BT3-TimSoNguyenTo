package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        int number = 121;
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(number);
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(number);
        Thread optimized = new Thread(optimizedPrimeFactorization);
        lazyPrimeFactorization.start();
        optimized.start();
    }
}
