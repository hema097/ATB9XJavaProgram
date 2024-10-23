package Tasks_October;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //1.Take the input from the use
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string :");
        String Input= scanner.nextLine();

        //2.checking the palindrome is tru or false for that we are using boolen
        boolean isPalindrome=true;
        int length= Input.length()  ;

        for(int i=0;i<length / 2;i++){
             if(Input.charAt(i) != Input.charAt(length-1-i)){
                 isPalindrome=false;
              break;

             }
        }
if(isPalindrome){
    System.out.println(Input +"is a Palindrome");
}
else {
    System.out.println(Input + "is not a Palindrome" );

}
scanner.close();
    }
}
