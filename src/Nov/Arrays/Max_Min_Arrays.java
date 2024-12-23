package Nov.Arrays;

import java.util.Scanner;

public class Max_Min_Arrays {
    public static void main(String[] args) {
        int[] array = {100, 98, 56, 89, 78};
        int Max_Value=Maximum(array);
        int Min_Value=Minimum(array);

        System.out.printf("Maximum number is %d",Max_Value);
        System.out.println(" ");
        System.out.printf("Minimum Number is %d" ,Min_Value);

    }

    static int Maximum(int[] array) {
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return  max;
    }

    static int Minimum(int[] array){
        int min=array[0];
        for (int i =0;i < array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

}


