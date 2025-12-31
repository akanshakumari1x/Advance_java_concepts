/*
A generic functional interface introduced in Java 5
Can return a result Can throw checked exceptions
Key characteristics:-
call() returns a value of type V
Checked exceptions are allowed
Designed for tasks that produce a result
Callable → "Do a task, return a result, and handle exceptions."
n real applications (like your banking system / Spring Boot backend):
Database calls,File processing,API calls
➡ These return results or throw exceptions
Callable → when result/exception is needed
 */
@FunctionalInterface
public interface CallableEx<V> {
    V call() throws Exception;
}

