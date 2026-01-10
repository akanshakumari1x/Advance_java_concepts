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
already implementing it. now i added one more method then all existing classes will break.
So, java8 allow default method.
syntax - interface Vehicle {
             void start();
             default void stop() {
                 System.out.println("Vehicle stopped");
             }
         }