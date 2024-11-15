package Nov.ex_06112024_ConstructorOverloading;

import java.sql.SQLOutput;

public class Constructor_overLoading {
    public static void main(String[] args) {

        //Constructor Method overloading
        //same class name :car11 but different values

        Car11 c11=new Car11();
        System.out.println(c11.name);
        System.out.println(c11.color);
        System.out.println(c11.year);


        Car11 c12=new Car11();
        System.out.println(c12.name);
        System.out.println(c12.color);
        System.out.println(c12.year);


    }
}
