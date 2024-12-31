package Class_Objects;

public class Dog_Class {
    //Attributes
    String DOg_name;
    String Colour;
    String Size;
    int Weight;
    int Age;

    //Behaviour

    void sleep(){
        System.out.println("My Dog is always sleeping....");

    }

    String dog_color(String color){
        System.out.println("My Dog colour is :" + color );
        return color;
    }

    int weight(int weight){
        System.out.println("my dog weight is :" + weight);
        return weight;
    }
}
