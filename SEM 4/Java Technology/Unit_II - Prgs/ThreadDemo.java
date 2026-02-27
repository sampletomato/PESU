class MyThread extends Thread {
    private long start;
    MyThread(long start) {
        System.out.println("Thread Created");this.start = start;
    }
    public void run() {
        for(int i = 0; i < 5; i++) {
            long curr = System.currentTimeMillis();
            System.out.println("Thread Running | " 
            + (curr - start) + " ms | " + "Iter: " + i);
            try {Thread.sleep(5000);}
            catch(InterruptedException e) {}
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread(System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
        t.start();
    }
}
