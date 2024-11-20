package ex_20112024_Lists_Collections;

import java.util.List;
import java.util.Vector;

public class Lab202_Vector {
    public static void main(String[] args) {

        Vector my_family=new Vector();
        my_family.add("Hema");
        my_family.add("Chaitu");
        my_family.add("Dishi");
        my_family.add("Ishaan");
        System.out.println(my_family);


        my_family.contains("Dishi");
        System.out.println(my_family);
        my_family.remove("Ishaan");
        System.out.println(my_family);
    }
}
