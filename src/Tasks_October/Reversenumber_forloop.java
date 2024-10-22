package Tasks_October;

public class Reversenumber_forloop {
    public static void main(String[] args) {
        int num=12345;
        int reverse=0;
        for(int i=0;num!=0;num=num/10) {
            int rem=num%10;
            reverse=reverse*10+rem;
        }
        System.out.println(i);
    }
}
