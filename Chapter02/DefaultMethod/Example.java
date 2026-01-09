interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }
}

public class Example {

    public static  void main(String [] arg){
        class Car implements Vehicle {
            public void start() {
                System.out.println("Car started");
            }
        }
        Car car = new Car();
        car.start();
        car.stop();

    }

}
