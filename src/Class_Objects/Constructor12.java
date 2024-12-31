package Class_Objects;

import java.util.Scanner;

public class Constructor12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Car ModelName:");
        String nameinput=sc.next();
        System.out.println("Enter the Car model Year:");
        int yearinput=sc.nextInt();

        Car21 c3=new Car21(nameinput,yearinput);
        System.out.println(c3.Model_name);
        System.out.println(c3.year);
        //c3.Car21("Nano",2024);
    }
}

class Car21 {
    String Model_name;
    int year;


   Car21(String Model_name_n, int year_y) {
        this.Model_name = Model_name_n;
        this.year = year_y;

    }
}

