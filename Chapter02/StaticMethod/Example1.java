interface Vehicle {
    static void serviceInfo() {
        System.out.println("General vehicle service rules");
    }

    default void start() {
        System.out.println("Vehicle started");
    }
}

class Car implements Vehicle {
}

public class Example1 {
    public static void main(String [] arg){

        Vehicle.serviceInfo();   // ✅ static
        Car car = new Car();
        car.start();             // ✅ default
    }
   // here static methods are not inherited  - to avoid confusion and diamond problems
   // Static methods must be called using the interface name.
}
