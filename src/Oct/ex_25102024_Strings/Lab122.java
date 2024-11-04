package Oct.ex_25102024_Strings;

import java.sql.SQLOutput;

public class Lab122 {
    public static void main(String[] args) {
        String s1="Hello"; ////SCP stored(string costant pool)
        String s2="Hello";  //scp
        String s10="Hello";


        String s5 = new String("Hello"); //stored in Object Area
        String s8 = new String("Hello");

//== comparison operator
        // == reference checking
        System.out.println(s1==s2);
        System.out.println(s1==s5);
        System.out.println(s5==s8);
    }
}
