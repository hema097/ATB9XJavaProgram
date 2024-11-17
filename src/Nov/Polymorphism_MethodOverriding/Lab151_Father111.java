package Nov.Polymorphism_MethodOverriding;

import Nov.MutlLevel_INHERITANCE_Hierarichal.FatherClass;

public class Lab151_Father111 {

    public static void main(String[] args) {
        Son s1=new Son();
        s1.Home();

        Father f1=new Father();
        f1.Home();


        //Dynamic Dispatch

        Father f2=new Son();
        f2.Home();
    }
}

//differeny class but same function name then its called Overriding
class Father{
    void Home(){
        System.out.println("Having 2 Bhk");
    }
}
class  Son extends Father {
    void Home(){
        System.out.println("Having 3 Bhk");
    }
}