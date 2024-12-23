package Practice;

import java.util.Scanner;

public class If_else_rank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score:");
        int score=sc.nextInt();
           char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
            System.out.println("Grade is :" + grade);
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
            System.out.println("Grade is :" + grade);
        } else if (score >= 70 && score <= 79) {
            grade='C';
            System.out.println("Grade is :" + grade);
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
            System.out.println("Grade is :" + grade);
        } else if (score <= 0 || score > 100) { // Edge Case
            System.out.println("LOL!!, are you God?");
            grade = 'O';

        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is -> " + grade);


    }
}
