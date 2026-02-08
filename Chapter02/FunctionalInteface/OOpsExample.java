// without functional interface boilerplate code.
interface Task {
    void execute();
}

class MyTask implements Task {
    public void execute() {
        System.out.println("Task running");
    }
}

public class OOpsExample {
    public static void main(String[] args) {
        Task task = new MyTask();
        task.execute();
    }
}

// With Functional Interface

@FunctionalInterface
interface Task {
    void execute();
}

public class Test {
    public static void main(String[] args) {
        Task task = () -> System.out.println("Task running");
        task.execute();
    }
}


