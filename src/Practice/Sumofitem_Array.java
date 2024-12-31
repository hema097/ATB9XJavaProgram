package Practice;

public class Sumofitem_Array {

        public static void main(String[] args) {
            int[] array = {10,13,12};
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum = sum+array[i];
            }

            System.out.println("Sum of array elements: " + sum);
        }
    }

