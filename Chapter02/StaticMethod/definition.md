\# What is a Static Method in an Interface?

A static method in an interface is a method with implementation that:

Belongs to the interface itself, Is NOT inherited by implementing classes, Is called using the interface name.



\# Why Were Static Methods Added?

To allow utility/helper methods inside interfaces without:

Forcing implementation in classes, Creating separate utility classes.



Static methods in interfaces provide utility behavior related to the interface and are not inherited or overridden by implementing classes.



\#JVM Rules for Static Methods in Interfaces (Java 8+):-



\##Static methods in interfaces are not part of the implementing class’s method table.

ex- interface A {

    static void show() {

        System.out.println("A");

    }

}

Call: A.show();

new A().show();   // compile-time error



\##Implementing classes do not inherit interface static methods





\##Static methods use compile-time binding, not runtime polymorphism.

interface A {

    static void show() {

        System.out.println("A");

    }

}



class Test implements A {

    static void show() {   // ❌ Not overriding

        System.out.println("Test");

    }

}

 This is method hiding, not overriding.

 JVM treats them as two unrelated methods.



\##Static methods must have a body.Cannot Be Abstract or Default.

\##Static Interface Methods Avoid Diamond Problem.

Static interface methods are stored in the interface’s constant pool

They are invoked using invokestatic

Not part of vtable

