package Nov.Polymorphism_MethodOverloading;

public class Example1_OverLoading {

    public static void main(String[] args) {

        Displayadd da=new Displayadd();
       float result= da.add(10,30,20f);
        System.out.println(result);

       int result1=da.add(10,25,100);
        System.out.println(result1);

    }
     //Method Overloading
    //Method will be overloaded
    //with in the Class same name different arguments or parameters


}

class Displayadd{

    float add(int a , int b, float c){
        System.out.println("Addition of the number is the result");
        return (a+b-c*a);
        }

    int add(int a ,int b, int c){
        System.out.println("Addition of 3 numbers");
        return  a+b+c;
    }

}
