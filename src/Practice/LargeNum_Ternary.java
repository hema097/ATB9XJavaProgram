package Practice;

public class LargeNum_Ternary {
    public static void main(String[] args) {
        int a=100;
        int b=89;
        int c=110;
        int result=(a>=b && a>=c)? a: (b>=c)? b : c;
        System.out.println("Maximum number is " + result);

    }

}
