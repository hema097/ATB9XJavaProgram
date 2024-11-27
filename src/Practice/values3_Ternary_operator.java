package Practice;

public class values3_Ternary_operator {
    public static void main(String[] args) {
        int age=20;
        String result=(age>18)?"Major":(age<18)?"Minor":"small age";
        System.out.println(result);
    }
}
