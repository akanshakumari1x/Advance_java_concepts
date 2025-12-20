
class IdGeneratorEx {

    private int counter = 0;

    // ❌ Removed synchronized
    public int getNextId() {
        return ++counter;
    }
}

public class RaceConditionExample {
    public static void main(String[] args) {

        IdGeneratorEx gen = new IdGeneratorEx();  // ONE object

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {    // more iterations to trigger race
                System.out.println(Thread.currentThread().getName() + " : " + gen.getNextId());
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();
    }
}

