
class Consumer extends Thread {
    private Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
                Thread.sleep(500); // slow down for visibility
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

