package Nov.Strings;

public class StringBuilder_StringBuffer_string {

    public static void main(String[] args) {

        //String Builder
        StringBuilder sb1=new StringBuilder("Hema");
          sb1.append("Polukuri");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        //String Buffer
        StringBuffer sb=new StringBuffer("Chaitu");
        sb.append("Dishi");
        System.out.println(sb);;

        //Strings

        String s1="Hema";
        String s2="chaitu";
        String s3=s1+s2;
        System.out.println(s3);


              
        
        
    }
}
