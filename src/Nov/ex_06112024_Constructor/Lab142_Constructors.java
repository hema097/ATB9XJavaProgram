package Nov.ex_06112024_Constructor;

import java.sql.SQLOutput;

public class Lab142_Constructors {
    public static void main(String[] args) {
  //when we are not assign any values then JVM  will  call the Default Constructor
        //Why we use constructor mainly
        //1.It's a speicalized method and dont have return type
        //2. Allocate memory and create a Referance
        //3. Assign values to the feilds.
        Car c1=new Car();//object creation
        System.out.println(c1.name);  //default values is "null"
        System.out.println(c1.model);  //default values is "null"
        System.out.println(c1.year); // default vaues is "Zero"


        Car c2=new Car();
        c2.name="Tata Tiago";
        System.out.println(c2.name);
        c2.model="Advanced";
        System.out.println(c2.model);
        c2.year=2024;
        System.out.println(c2.year);

    }
}
