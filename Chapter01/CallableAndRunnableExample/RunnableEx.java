/*In Java concurrency, Runnable and Callable both represent tasks that can be executed
by a thread, but they differ in what they return and how they handle exceptions.

A functional interface with no return value,Cannot throw checked exceptions.
Key characteristics:-
run() returns void
Checked exceptions are not allowed
Suitable for fire-and-forget tasks
Runnable → "Do a task, don’t return anything."
Runnable → when only execution matters
*/

@FunctionalInterface
public interface RunnableEx {
    void run();
}







