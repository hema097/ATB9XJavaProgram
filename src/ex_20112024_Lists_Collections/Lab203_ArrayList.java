package ex_20112024_Lists_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Bread");
        list.add("Milk");
        list.add("Panneer");
        list.add("Jam");
        list.add("Cheeze");
        list.add(123);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));

        System.out.println(" ------ default for loop ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------For EachLoop");
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("- To Print Arraylist Iterator ");
        // Iterator - Anchor - go one by one forward -> get access them
        // HasNext() -> true - If we have a next element
        // Next -> element


        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
