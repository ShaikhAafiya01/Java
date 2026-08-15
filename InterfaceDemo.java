interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts");
    }

    public void stop() {
        System.out.println("Car stops");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.stop();
    }
}