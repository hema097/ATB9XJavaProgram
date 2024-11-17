package Nov.Polymorphism_MethodOverloading;

public class Lab149_overloading {
    public void main(String[] args) {
        Mathoperations mp=new Mathoperations();

        int result=mp.add(10,10);
        System.out.println("Return the values of :" + result);

        float result1=mp.add(3.4f,10.5f);
        System.out.println("Return the values of :" + result1);


        double resul3=mp.add(30,2.9f,10);
        System.out.println("result3");

    }

    class  Mathoperations
    {
        //Method Overloading
        //Method will be overloaded
        //same name different arguments or parameters
        //Compiletime
        int add(int a, int b){
            return a+b;
       }

       float add(float a,float b){
            return a+b;
       }


       double add(int a,float b, double c){
            return a-b+c*a;
       }
    }
}

