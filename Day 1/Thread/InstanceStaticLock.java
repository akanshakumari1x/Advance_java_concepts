class Example {

    public synchronized void instanceMethod() {
        System.out.println("Instance lock: " + Thread.currentThread().getName());
    }

    public static synchronized void staticMethod() {
        System.out.println("Class lock: " + Thread.currentThread().getName());
    }
}

public class InstanceStaticLock {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        // Instance lock — obj1 and obj2 have separate locks
        new Thread(() -> obj1.instanceMethod()).start();
        new Thread(() -> obj2.instanceMethod()).start();

        // Static lock — same lock (Example.class)
        new Thread(() -> Example.staticMethod()).start();
        new Thread(() -> Example.staticMethod()).start();

        //obj1.instanceMethod() and obj2.instanceMethod() do not block each other
        //Because they use different object locks
    }
}

