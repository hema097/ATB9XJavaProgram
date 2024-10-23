package Oct.ex_23102024_Functions;

public class Lab114 {
    public static void main(String[] args) {
        //User defined functions 4 parts

        //1.Without paramenters without returntype

//        for (int i = 0; i < 99; i++){
//
//            greet(); //Without paramenters without returntype
        greet_with_hello();//without Parameters but with returntype
//    }
        //2.without parameters with retuentype
        String retuned_value=greet_with_hello();
        System.out.println(retuned_value);

        int voting_age = age_of_vote();
        System.out.println("voting age");
        if (voting_age >=18)
        {
            System.out.println("allowed to vote");
        }
        else{
            System.out.println("Not allowed to vote ");
        }

        //3.with parameters with returnrype

        greet_with_name("hema");
        firstname_lastname("hemavathi","polukuri");
        //4.without parameter with returntype

        int result= sum_of_two_numbers(10,20);
        System.out.println(result);

    }
//without arguments witout return type
    static void greet() {
        System.out.println("hi are you");//1.Without paramenters without returntype
    }


    //2.without Parameters but with returntype
    static String greet_with_hello() {
        System.out.println("Hi");
        return "Hi,you are awesome ";
    }
    static int age_of_vote(){
        System.out.println("Hi ..can i vote");
        return 18;

    }

    //3.with parameters without returntype

    static void greet_with_name(String name){
        System.out.println("Hi your name is:"+name);

    }
    static void firstname_lastname(String firstname,String lastname)
    {
        System.out.println("first and last name is :"+firstname + lastname);
    }



    //4.with parameter with return type
    static int sum_of_two_numbers(int a,int b){
        return a+b;
    }
}

