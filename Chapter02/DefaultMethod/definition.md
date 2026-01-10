# What is a Default Method?
## A default method is a method inside an interface that has a body(implementation).
Default methods allow interfaces to have method implementations so new methods can be added without breaking existing implementing classes.
Before Java 8, interfaces could only have:
abstract methods
constants

Java 8 added:
default methods
static methods

Why Default Methods Were Introduced?
To add new methods to existing interfaces without breaking old implementations.
Suppose if i declared the interface with the single method now thousands of classes
already implementing it, and i added one more method then all existing classes will break.
So, java8 allow default method.

```
syntax - interface Vehicle {
             void start();
             default void stop() {
                 System.out.println("Vehicle stopped"); }
         }
```

#Diamond Problem in Default Methods
## The Diamond Problem occurs when a class inherits the same method from two parents, creating ambiguity about which implementation to use.
Real-Life Ex- Child - mother says- dinner time is 8, but father says dinner time is 9. now child confused. this confusion is diamond problem.
and also multiple inheritance.
Java allows multiple inheritance only via interfaces...but what if both interfaces have default methods? get compiler error. so java forces to decide. check example.
