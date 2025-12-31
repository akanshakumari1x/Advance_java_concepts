/*
A generic functional interface introduced in Java 5
Can return a result Can throw checked exceptions
Key characteristics:-
call() returns a value of type V
Checked exceptions are allowed
Designed for tasks that produce a result


 */
@FunctionalInterface
public interface CallableEx<V> {
    V call() throws Exception;
}

