package Practice;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class num3_user_ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number1 value:");
        int num1=sc.nextInt();
        System.out.println("Enther the Number2 value:");
        int num2=sc.nextInt();
        System.out.println("Enter the Number3 value:");
        int num3=sc.nextInt();

        if(num1>num2){
            System.out.println("The given number is num1 is greater");

        } else if (num2>num3) {
            System.out.println("The given number is num2 is greater");

        }
        else {
            System.out.println("Equal");
        }

    }
}
