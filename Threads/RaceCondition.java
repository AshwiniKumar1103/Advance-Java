package Threads;

class Counter {
    int counter;

    public synchronized void Increment() {
        counter++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter C = new Counter();
        Runnable obj = () -> {
            for (int i = 0; i < 1000; i++) {
                C.Increment();
                // System.out.println(C.counter);
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                C.Increment();
                // System.out.println(C.counter);
            }
        };
        Thread T1 = new Thread(obj);
        Thread T2 = new Thread(obj2);

        T1.start();
        T2.start();
        T1.join();
        T2.join();
        System.out.println(C.counter);
    }
}
