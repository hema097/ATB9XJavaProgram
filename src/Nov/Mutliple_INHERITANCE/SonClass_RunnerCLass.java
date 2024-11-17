package Nov.Mutliple_INHERITANCE;

import Nov.INHERITANCE.Son;

public class SonClass_RunnerCLass extends Father{   //Not possible in Java we can,t extends
    // both Father and Mother propeties this is calles Multiple Inheritance
    public static void main(String[] args) {

        Son s1=new Son();
        System.out.println("Getting Property from either father or MOther");
       // money(); //we cant possible


    }
}
