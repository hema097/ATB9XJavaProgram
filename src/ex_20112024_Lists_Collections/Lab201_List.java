package ex_20112024_Lists_Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab201_List {

        public static void main(String[] args) {

            List mylist = new ArrayList(); // Arrays Format - Continuous
            //List mylist2 = new LinkedList(); // Doubly Linked List.
            // How they are stored in the memory

            List fruits = List.of("Orange","Apple");
            //fruits.add("WaterMelon"); // java.lang.UnsupportedOperationException
            System.out.println(fruits);



        }
}
