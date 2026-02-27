class Counter {
    int count = 0;
    synchronized void increment() {count++;}
}
class MyTask implements Runnable {
    private Counter counter;
    MyTask(Counter counter) {this.counter = counter;}
    public void run() {
        for(int i = 0; i < 100000; i++) 
            counter.increment();
    }
}
public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new MyTask(counter));
        Thread t2 = new Thread(new MyTask(counter));
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println("Final Count: " + counter.count);
    }
}