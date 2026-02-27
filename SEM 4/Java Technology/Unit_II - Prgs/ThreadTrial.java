class MyThread extends Thread {
    MyThread() {
        System.out.println("Thread Created");
    }
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println("Thread Running");
            try {
                Thread.sleep(5000);
            } catch(InterruptedException e) {System.out.println("Interrupt");}
        }
    }
}
public class ThreadTrial {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
