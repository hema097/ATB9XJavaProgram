package Practice;

public class LargestNum2_Arrays {
    public static void main(String[] args) {

        int arr[]={100,98,89,78,76,73,67};
        int size= arr.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){

                if(arr[i]>arr[j]){

                    int t=arr[i];

                    arr[i]=arr[j];
                    arr[j]=t;

                }

            }
        }

        System.out.println("2nd largest number" + arr[size-3]);
    }

}
