package Nov.ex_05112024_Class_Attributes;

import org.w3c.dom.ls.LSOutput;

import java.net.Socket;
import java.sql.SQLOutput;

//CAB Rule
//Classname is :Car_CAB_Classname_Attributes_Behaviour
public class Car_CAB_Classname_Attributes_Behaviour {

    //Attributes

    String car_name;
    String Car_colour;
    int car_speed;
    int Car_model;
    int Car_no;


    //Behavior
    //Methods or Functions

    public String name( ){
        String name="Tata Nexon";
        System.out.println("Car name is :"+ name);
        return name;
    }

    String Colour( )
    {
        String Colour= "Red";
        System.out.println("Car colour is :"+Colour);
        return Colour;

    }
    public int speed(int a)
    {
         //a=100;
         System.out.println("Car speed is :"+a);
         return a;
    }

    public int model(int b){
        //b=2024;
        System.out.println("Car Model is:"+b);
        return b;
    }




}
