package com.inabananami.a17printnumberexercise;

public class MyThread extends Thread {

    static int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                for (; number <= 10000000; number++) {
                    if (isPrime(number)) {
                        System.out.println(getName() + ":" + number);
                    }
                }
                if (number >= 10000000) {
                    break;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}