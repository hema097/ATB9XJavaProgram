package Practice;

import java.util.Scanner;

public class Triangle_3sidesequal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //input 3 sides from the user
        System.out.println("Enter the side1 value:");
        double side1=sc.nextDouble();

        System.out.println("Enter the side2 value:");
        double side2=sc.nextDouble();

        System.out.println("Enter the side3 value:");
        double side3=sc.nextDouble();

        //logic:
        //data type is double
        //need to check negative values also
        //if side1<=0 && side2<=0 && side3<=0 --> then INvalid input
        //next side1==side2 && side2==side3 && side1==side3 -->ten its a triangle is eqalliteral
        //next if any 2 sides are eual then the triangle is Isoceles
        //else No sides are equal(scalene)

        if(side1<=0 || side2<=0 || side3<=0){
            System.out.println("Invalide input ,Enter the number always positive..");
        } else if (side1==side2 && side2==side3 && side1 ==side3) {
            System.out.println("The triangle is Equal all the sides!!!");
        } else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("The Triagle is 2 sides are equal :Isoceles");
        }else{
            System.out.println("The triangle is No sides are equal:Scalene..");
        }


    }

}
