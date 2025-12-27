
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

        notify(); // notify consumer
    }

    // Consumer method
    public synchronized int consume() throws InterruptedException {
        while (!hasValue) {
            wait(); // wait until producer produces
        }

        System.out.println("Consumed: " + number);
        hasValue = false;

        notify(); // notify producer
        return number;
    }
}
