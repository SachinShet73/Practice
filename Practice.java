//Simple script to understand the properties and behavior of an object

class Car{
    static int mileage  = 18;
    static int cost  = 1500000;
    static String name = "Nexon";

    void start()
    {
        System.out.println("The car has started");
    }

    void accelerate()
    {
        System.out.println("The car has accelerated");
    }

    void stop()
    {
        System.out.println("The car has stopped");
    }

    public static void main(String args[])
    {
        Car c1 = new Car();
        c1.start();
        c1.accelerate();
        c1.stop();
    }
}