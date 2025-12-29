
class Buffer {
    private int number;
    private boolean hasValue = false;

    // Producer method
    public synchronized void produce(int value) throws InterruptedException {
        while (hasValue) {
            wait(); // wait until consumer consumes
        }

        number = value;
        hasValue = true;
        System.out.println("Produced: " + number);

        notify();
        

//        Producer produce first value, consumer consumes it waits for producer to produce again
//         bcz it was never notified both threads go into waiting state forever.
    }

    // Consumer method
    public synchronized int consume() throws InterruptedException {
//        while is used instead of if with wait() to re-check the condition
//        after wakeup, protecting against spurious wakeups.

        while (!hasValue) {
            wait(); // wait until producer produces
        }

        System.out.println("Consumed: " + number);
        hasValue = false;

        notify(); // notify producer
        return number;
    }
}
