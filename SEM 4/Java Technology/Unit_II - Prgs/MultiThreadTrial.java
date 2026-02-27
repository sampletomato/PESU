class MyThread1 implements Runnable {
    private long start;
    MyThread1(long start) {this.start = start;}
    public void run() {
        for(int i = 0; i <= 5; i++) {
            long curr = System.currentTimeMillis();
            System.out.println("Thread 1 Running " + (curr - start) + " ms Current iter: " + i);
            try {
                Thread.sleep(5000);
            } catch(InterruptedException e) {}
        }
    }
}
class MyThread2 extends Thread {
    private long start;
    MyThread2(long start) {this.start = start;}
    public void run() {
        for(int i = 0; i <= 5; i++) {
            long curr = System.currentTimeMillis();
            System.out.println("Thread 2 Running " + (curr - start) + " ms Current iter: " + i);
            try {
                Thread.sleep(2500);
            } catch(InterruptedException e) {}
        }
    }
}

public class MultiThreadTrial {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new MyThread1(start));
        MyThread2 t2 = new MyThread2(start);
        t1.start();t2.start();
        // t1.run();t2.run();
    }
}
