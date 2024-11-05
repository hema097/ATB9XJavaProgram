package Nov.ex_05112024_Class_Attributes;

//CLass name -->Dog_Attributes
public class Dog_Attributes {
    //Attributes

    String name;
    int age;
    String colour;
    String breed;
    int weight;
    int size;

    //behaviour


    Void sleep(){
        return null;
    }
    String colour(String colour){
        System.out.println("Dog colour is :white");
        return colour;
    }
    void eat(){
        System.out.println("Dog is eating");
    }
    void play(){
        System.out.println("Dog is playing");
    }
    String sound(String sound){
        System.out.println("dog sound is bow bow....");
        return sound;

    }

}
