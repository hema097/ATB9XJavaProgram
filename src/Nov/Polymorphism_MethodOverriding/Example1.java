package Nov.Polymorphism_MethodOverriding;

public class Example1 {
    public  void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();

        Dog d=new Dog();
        d.eat();

    }
    //different class but function name is calles Overriding

    class Cat{
        void eat(){
            System.out.println("Cats are eating meat");
        }
    }
    class Dog extends Cat{
        void eat(){
            System.out.println("Dog is eating meat");
        }
    }

}

