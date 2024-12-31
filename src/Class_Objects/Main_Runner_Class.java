package Class_Objects;

public class Main_Runner_Class {

    public static void main(String[] args) {
        Dog_Class d1=new Dog_Class();
        d1.DOg_name="Puppy";
        System.out.println(d1.DOg_name);
        d1.Colour="Black";
        System.out.println(d1.Colour);
        d1.Age=10;
        System.out.println(d1.Age);

        d1.sleep();
        d1.weight(10);
        d1.dog_color("White");


    }
}
