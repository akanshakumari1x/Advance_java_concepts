public class ThreadLifeCycle {

    static final Object lock = new Object();

    //providing the implementation of the Runnable interface using a lambda expression.

 public static void main(String[] args) throws InterruptedException {

//   1.NEW State :A thread is in NEW state when it is created but start() has not been called yet.

        Thread t = new Thread(() -> {
            System.out.println("Thread running");
        });
        System.out.println("State: " + t.getState());

     // using construction 2

         Runnable runnable1 = () -> {
         };
         Thread t2 = new Thread(runnable1);
         System.out.println("New thread t2: " + t2.getState());

//   2. Runnable State:A thread enters RUNNABLE state after start() is called and it is ready to run or currently running.

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
              System.out.println("Thread runnable");
            }
        });
        t1.start();
        System.out.println("State: " + t1.getState());


//    3. TIMED_WAITING:A thread enters TIMED_WAITING state when it waits for a fixed amount of time, such as by calling sleep(), wait(timeout), or join(timeout).

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {

            }
        });
        t.start();
        Thread.sleep(1000);
        System.out.println("State: " + t.getState());


//     4. WAITING_STATE

// A thread enters WAITING state when it calls wait() or join() without timeout and waits indefinitely for notification.
// Why is this WAITING not TIMED_WAITING:- join() has no timeout,Thread waits indefinitely,Only interrupt() can wake it

         Thread worker = new Thread(() -> {
             try {
                 System.out.println("Worker thread going to wait...");
                 Thread.currentThread().join(); // means “This thread is waiting for itself to finish.”
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         });
         worker.start();
         Thread.sleep(100);
         // WAITING
         System.out.println("Worker thread state: " + worker.getState());


  //   5. BLOCKED_STATE
 //    A thread enters BLOCKED state when it tries to enter a synchronized block but the monitor lock is already held by another thread.
 //    t1 gets the lock and goes to sleep for 3 seconds, Lock is NOT released during sleep, t2 tries to enter synchronized block
 //    It enters BLOCKED state, JVM puts it in monitor entry queue


         Thread t1 = new Thread(() -> {
             synchronized (lock) {
                 System.out.println("t1 got the lock");
                 try {
                     Thread.sleep(3000); // holds lock for 3 seconds
                 } catch (InterruptedException e) {}
             }
         });

         Thread t2 = new Thread(() -> {
             System.out.println("t2 trying to get the lock...");
             synchronized (lock) {
                 System.out.println("t2 got the lock");
             }
         });

         t1.start();
         Thread.sleep(100); // ensure t1 acquires the lock first
         t2.start();
         Thread.sleep(100);

         // BLOCKED
         System.out.println("t2 state: " + t2.getState());

// 6. TERMINATED_THREAD:TERMINATED means the thread has finished its execution and cannot be restarted.


     Thread t = new Thread(() -> {
         System.out.println("Thread completed");
     });

     t.start();
     t.join(); // wait for completion

     // TERMINATED
     System.out.println("State: " + t.getState());


         }
     }


