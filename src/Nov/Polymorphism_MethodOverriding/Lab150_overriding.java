package Nov.Polymorphism_MethodOverriding;

public class Lab150_overriding {

    public void main(String[] args) {
        hound h1 = new hound();
        h1.bark();
    }

        class Dog {
            void bark() {
                System.out.println(" Dog is barking....");
            }

            // int age=10;
        }

        class hound extends Dog {
            void bark() {
                System.out.println("Hound id barking....");
            }
        }


}
