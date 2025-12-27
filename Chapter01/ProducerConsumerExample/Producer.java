
class Producer extends Thread {
    private Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
                Thread.sleep(500); // slow down for visibility
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

