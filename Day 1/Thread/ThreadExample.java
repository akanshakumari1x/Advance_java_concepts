
class Demo {
   //  the method is synchronized, only one thread at a time can run printMessage().
    public synchronized void printMessage() {
        System.out.println(Thread.currentThread().getName() + " acquired object lock");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Demo d = new Demo(); // ONE object

        Runnable task = () -> d.printMessage();

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

