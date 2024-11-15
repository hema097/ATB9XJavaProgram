package Nov.ex_06112024_Constructor;

public class Car {
    String model; //fields
    int year;
    String name;
    String color;

    //default constructor
    Car(){
                 //default constructor means Class name and method name should be same
                 //No arguments with no return type

        name= "XXXX";
        model="yyyy";
        year=0000;
        System.out.println("Default constructor");
    }

    public static void startCar() {

        System.out.println("Car started");
    }
}
