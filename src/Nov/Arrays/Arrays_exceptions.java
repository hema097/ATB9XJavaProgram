package Nov.Arrays;
import  java.util.Scanner;


public class Arrays_exceptions {
    public static void main(String[] args) {

        //int[] a = new int[-1];
        int[] a2 = new int[5];
        //System.out.println(a); // NegativeArraySizeException
        System.out.println(a2[10]); // .ArrayIndexOutOfBoundsException

        int[] a3 = {-1, -2, -3};
        int[] a4 = new int[3];
        a4[0] = -90;
        a4[1] = -91;
        a4[2] = -91;
    }
}
