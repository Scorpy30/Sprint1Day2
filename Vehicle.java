public class Vehicle {
    String colour;
    int speed;

    public Vehicle(String colour, int speed){
        this.colour = colour;
        this.speed = speed;
    }
    public void displayInfo(){
        System.out.println("Colour : "+colour);
        System.out.println("Speed : "+ speed + "km/h");
    }
    public void start(){
        System.out.println("Ignition on");
    }
    public void stop(){
        System.out.println("Ignition off");
    }
}

class Car extends Vehicle {
    String model;
    public Car(String colour, int speed, String model){
        super(colour, speed);
        this.model = model;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Model : "+model);
    }
    public void openTrunk(){
        System.out.println("Controls Trunk of the car");
    }
}

class Bus extends Vehicle{
    int seatingCap;
    public Bus(String colour, int speed, int seatingCap){
        super(colour, speed);
        this.seatingCap = seatingCap;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seating Capacity : "+seatingCap);
    }
    public void announceStop(){
        System.out.println("Next Stop is .... ");
    }
}

class Main{
    public static void main(String[] args){
        Car car = new Car("Red", 210, "Mustang");
        Bus bus = new Bus("Black", 120, 40);

        System.out.println("Car Info");
        car.start();
        car.displayInfo();
        car.openTrunk();
        car.stop();

        System.out.println();

        System.out.println("Bus Info");
        bus.start();
        bus.displayInfo();
        bus.announceStop();
        bus.stop();
    }
}