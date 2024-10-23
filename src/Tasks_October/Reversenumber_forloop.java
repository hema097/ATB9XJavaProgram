package Tasks_October;

import java.util.Scanner;

public class Reversenumber_forloop {
    public static void main(String[] args) {
        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numer");
        int input = scanner.nextInt();

        // call thethe reverse a number methd
        int revNumber = reverseNumber(input);
        System.out.println("reverse Number:" + revNumber);
    }

    private static int reverseNumber(int input) {
        int reveValue = 0;
         for(;input != 0;input /= 10){
//        while (input !=0) {
            int mod = input % 10; //5
            reveValue = reveValue * 10 + mod; //#0*10 +5
//            input = input / 10;
//        }
            }
        return reveValue;
    }
}



