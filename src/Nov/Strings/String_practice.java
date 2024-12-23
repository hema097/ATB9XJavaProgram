package Nov.Strings;

public class String_practice {

    public static void main(String[] args) {
//        String name="Hello Hema12345";
//        String name1="polukuri";
//        //Concatination 2 string
//        String name3=name+name1;
//        System.out.println(name3);
//
//        //Substring we need to provide begin index and end index
//
//        System.out.println(name.substring(4,10));
//
//        //Split based on the delemeter
//
//        String fruits = "apple,banana,cherry"; // delimter = ,
//        String[] split_fruits = fruits.split(",");
//        System.out.println(split_fruits[0]);
//        System.out.println(split_fruits[1]);
//        System.out.println(split_fruits[2]);
//
//        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
//        String[] split_fruits2 = fruits2.split("-");
//        System.out.println(split_fruits2[0]);
//        System.out.println(split_fruits2[1]);
//        System.out.println(split_fruits2[2]);

//CharAt() it will gives the position based on the index
//        System.out.println("chrAt() function");
//        String s4 = "Hemavathi";
//        System.out.println(s4.charAt(0));
//        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException
//
//        //Trim() it will replcase the leading and trailing spaces
//        System.out.println("Trim function:");
//        String s5 = " Pramod ";
//        System.out.println(s5.trim());

//        String s6 = "Pramod";
//        System.out.println(s6.indexOf("r"));
//        System.out.println(s6.indexOf("d"));




        String s7 = "Hemavathi";
        char[] charArray = s7.toCharArray();
        char c = charArray[1];

        String s8 = "Kiran Test New";
        String[] s = s8.split(" ");
        System.out.println(s7.toLowerCase().contains("he"));// boolean values
        System.out.println(s7.contains("zy"));
        System.out.println(s7 + (10+3) + "New");


//        String s8 = "Pramoddutta";
//        System.out.println(s8.lastIndexOf("d"));
//
//        String s9 = "Pramoddutta";
//        System.out.println(s9.replace("d","z"));
//        System.out.println(s9.replaceAll("d","z"));
//
//        String s10 = "Pramodduttaji";
//        System.out.println(s10.startsWith("Pra"));
//        System.out.println(s10.endsWith("ji"));
//        System.out.println(s10.endsWith("zy"));
//
//
//
//        String original = "banana";
//        String result1 = original.replace('a', 'o');
//        System.out.println(result1);
//
//        String original1 = "Hello123 World456!";
//        String result2 = original1.replaceAll("\\d+", "-");
//        System.out.println(result2);
//
//
//        String result3 = original1.replaceAll("o", "O");
//        System.out.println(result3);

    }
}
