//Simple script to understand the properties and behavior of an object

class Practice{
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

    int stop()
    {
        System.out.println("The car has stopped");
        return 2;
    }

    public static void main(String args[])
    {
        Practice c1 = new Practice();
        c1.start();
        c1.accelerate();
        int number = c1.stop();

        System.out.println(number);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
    }
}