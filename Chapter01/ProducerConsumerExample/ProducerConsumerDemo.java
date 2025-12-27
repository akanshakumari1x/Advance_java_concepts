/*Producer produces numbers 1 to 10, Consumer consumes them one at a time, and
wait() /notify() handle synchronization safely.*/

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}

