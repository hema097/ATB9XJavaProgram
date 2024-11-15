package Nov.ex_06112024_Constructor;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Lab143_Constructor_Parametarized {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);  //input from the user


 Car3 t3=new Car3("tata punch","Basic",2025);
        System.out.println(t3.Name);
        System.out.println(t3.model);
        System.out.println(t3.year);
           t3.display();


   Car3 t4=new Car3("Renault","expert",2024);
        System.out.println(t4.Name);
        System.out.println(t4.model);
        System.out.println(t4.year);
        t4.display();

  //Taking input from the user parameterized values
        System.out.println("ENTER THE CAR NAME");
        String  car_Name=sc.next();
        System.out.println("ENTER THE CAR MODEL");
        String car_model=sc.next();
        System.out.println("ENTER THE CAR MANUFACTURED YEAR ");
        int car_year=sc.nextInt();
        Car3 t5=new Car3(car_Name,car_model,car_year);
        System.out.println(t5.Name);
        System.out.println(t5.model);
        System.out.println(t5.year);
            t5.display();
    }
}
class  Car3 {
    String Name;
    String model;
    int year;
//Parameterized constructor

Car3 (String Name , String model,int year){
    System.out.println("Parameteriazed constructor"); //class-->fileds , variablea--Methods
    this.Name=Name;  //this keyword is always refers to your Current class.
    this.model=model;
    this.year=year;
}

void display(){
    System.out.println("Car2 details : " +  this.Name  + " "+ this.model  + " "+ this.year ) ;
}

        }