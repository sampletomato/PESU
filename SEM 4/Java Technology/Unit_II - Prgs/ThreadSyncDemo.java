class Counter {
    int c = 0;
    synchronized public void increment() {c++;}
}
class MyThread implements Runnable {
    private Counter counter;
    MyThread(Counter counter) {this.counter = counter;}
    public void run() {
        for(int i = 0; i < 100000; i++) {
            counter.increment();
            if(i % 10000 == 0) 
                System.out.println(
                Thread.currentThread().getName() + ": " + 
                System.currentTimeMillis());
        }
    }
}
public class ThreadSyncDemo {
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        Thread t1 = new Thread(new MyThread(counter));
        Thread t2 = new Thread(new MyThread(counter));
        Thread t3 = new Thread(new MyThread(counter));
        t1.setName("t1");t2.setName("t2");
        t3.setName("t3");
        t1.start();t2.start();t3.start();
        t1.join();t2.join();t3.join();
        System.out.println(counter.c);
    }
}
