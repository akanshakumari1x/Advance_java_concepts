class IdGenerator {

        private static int counter = 0;

        // static synchronized → locks on IdGenerator.class
        public static synchronized int getNextId() {
            return ++counter;
        }
    }
     // This will create a ID generation that must be unique across the whole application

    public class IDGeneratorExample {
        public static void main(String[] args) {
            Runnable task = () -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + IdGenerator.getNextId());
                }
            };

            Thread t1 = new Thread(task, "T1");
            Thread t2 = new Thread(task, "T2");
            Thread t3 = new Thread(task, "T3");

            t1.start();
            t2.start();
            t3.start();
        }
    }
