package Nov.ex_05112024_Class_Attributes;

public class Dog_RunnerClass {
    public static void main(String[] args) {

        Dog_Attributes d1=new Dog_Attributes();
        d1.name = "Dumpy";
        d1.breed = "Biscuit";
        d1.age = 4;
        d1.weight = 25;
        d1.colour = "Golden";
        d1.eat();
        d1.play();
        d1.sleep();
        d1.colour("String");



        Dog_Attributes d2=new Dog_Attributes();
        d2.name = "puppy";
        d2.breed = "Labrador";
        d2.age = 4;
        d2.weight = 28;
        d2.colour = "Black";
        d2.eat();
        d2.play();
        d2.sleep();
        d2.colour("String");

        Dog_Attributes d3=new Dog_Attributes();
        d3.name = "snoopy";
        d3.breed = "German Shepherd";
        d3.age = 2;
        d3.weight = 21;
        d3.colour = "Golden black";

        d3.eat();
        d3.play();
        d3.sleep();
        d3.colour("String");

        Dog_Attributes d4=new Dog_Attributes();
        d4.name = "loosy";
        d4.breed = "Pub";
        d4.age = 3;
        d4.weight = 22;
        d4.colour = "White Black";

        d4.eat();
        d4.play();
        d4.sleep();
        d4.colour("String");

        Dog_Attributes d5=new Dog_Attributes();
        d5.name = "Roosey";
        d5.breed = "Desetchund";
        d5.age = 3;
        d5.weight = 26;
        d5.colour = "Black Golden";


        d5.eat();
        d5.play();
        d5.sleep();
        d5.colour("String");
    }
}
