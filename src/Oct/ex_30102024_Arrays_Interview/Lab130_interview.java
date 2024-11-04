package Oct.ex_30102024_Arrays_Interview;

import java.util.Scanner;

public class Lab130_interview {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the pattern to be printed:");
        int n= sc.nextInt();
        for (int i=n;i >=0;i--){
            for(int j=0;j <i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
