package br.curso.poo.exercises;

public class Exercise2 {


    public static class Runner1 implements Runnable {
        @Override
        public void run() {
            int i = 0;
            do {
                System.out.println("Runner 01 is running....");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (i++ < 10);
        }
    }

    public static class Runner2 implements Runnable {
        @Override
        public void run() {
            int i = 0;
            do {
                System.out.println("Runner 02 is running....");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (i++ < 10);
        }
    }

    public static void main(String... args) {
        new Thread(new Runner1()).start();
        new Thread(new Runner2()).start();
    }
}
