class MyThread1 extends Thread {
    private long start;
    MyThread1(long start) {
        System.out.println("T1 Started"); this.start = start;
    }
    public void run() {
        for(int i = 0; i < 5; i++) {
            long curr = System.currentTimeMillis();
            System.out.println("T1 Running | " + 
            (curr - start) + " ms | Iter: " + i);
            try {Thread.sleep(5000);}
            catch(InterruptedException e) {}
        }
        System.out.println("T1 terminiated");
    }
}
class MyThread2 extends Thread {
    private long start;
    MyThread2(long start) {
        System.out.println("T2 Started"); this.start = start;
    }
    public void run() {
        for(int i = 0; i < 5; i++) {
            long curr = System.currentTimeMillis();
            System.out.println("T2 Running | " + 
            (curr - start) + " ms | Iter: " + i);
            try {Thread.sleep(2500);}
            catch(InterruptedException e) {}
        }
        System.out.println("T2 terminiated");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        MyThread1 t1 = new MyThread1(start);
        MyThread2 t2 = new MyThread2(start);
        t1.start();t2.start();
        // t1.run();t2.run();
    }
}
