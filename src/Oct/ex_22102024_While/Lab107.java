package Oct.ex_22102024_While;

public class Lab107 {
    public static void main(String[] args) {
        //Two ways to read the inputs
        //1.Passing arguments
        //2.Scanner class
        //Take a user inputs for the age=32 and print the output
        //age is 30,29,28,27......................

        //Arguments
        String arg_age= args[0];   //int to String
        int age =Integer.parseInt(arg_age);   //string to integer conversion
        System.out.println(age);
        while(age>0)
        {
            System.out.println(age);
            age--;
        }



    }
}
