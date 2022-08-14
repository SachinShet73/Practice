//Simple script to understand the properties and behavior of an object

class Car{
    static int mileage  = 18;
    static int cost  = 1500000;
    static String name = "Nexon";

    static void start()
    {
        System.out.println("The car has started");
    }

    static void accelerate()
    {
        System.out.println("The car has accelerated");
    }

    static void stop()
    {
        System.out.println("The car has stopped");
    }

    public static void main(String args[])
    {
        System.out.println("The mileage of the car is %d" +mileage);
        System.out.println("The mileage of the car is  " + cost);
        System.out.println("The mileage of the car is  " + name);

        start();
        accelerate();
        stop();

    }
}