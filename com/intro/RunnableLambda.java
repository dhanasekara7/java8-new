package com.intro;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i < 3000; i++) {
                    System.out.println("Hello world from thread [" +
                            Thread.currentThread().getName() +
                            " " + i + "]");
                }
            }
        };

        final Runnable runnableLambda = () -> {
            for (int i = 0 ; i < 2000; i++) {
                System.out.println("Hello world from thread [" +
                        Thread.currentThread().getName() +
                        " " + i + "]");
            }
        };

        Thread t = new Thread(runnableLambda);
        t.start();
        t.join();
    }
}
