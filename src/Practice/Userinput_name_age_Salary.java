package Practice;

import java.util.Scanner;

public class Userinput_name_age_Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.next();


        System.out.println("Enter the Age :");
        int age=sc.nextInt();

        System.out.println("Enter the Salary is :");
        int salary=sc.nextInt();

        System.out.println("Name is " +name+ "\n Age is " + age +"\n Salary is " +salary);
        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
        System.out.println("Salary is " +salary);


        //DScanner.close();
    }
}
