package Practice;

import java.util.Scanner;

public class Hacker_rank2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks here:");
        int marks=sc.nextInt();
        char grade;
        if (marks>=500 && marks<=599)
        {
            grade='A';
            System.out.println("your grade is :" + grade);
        }
        else if (marks>=400 && marks<=499)
        {
            grade='B';
            System.out.println("your grade is :" + grade);
        }
        else if (marks>=300 && marks<=399)
        {
            grade='C';
            System.out.println("your grade is :" + grade);

        }
        else {
            System.out.println("you are failed");
        }
    }
}
