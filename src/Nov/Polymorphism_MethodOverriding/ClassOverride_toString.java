package Nov.Polymorphism_MethodOverriding;

public class ClassOverride_toString {

    //Class Student
    class Student {
        int rollno;
        String name;
        String city;

        //Parameterized Constructor

        Student(int rollno, String name, String city) {
            this.rollno = rollno;
            this.name = name;
            this.city = city;
        }

        //toString() function-->The toString() method in Java is used to return a string representation of an object. By default,
        // it returns a string that consists of the class name followed by the "@" character and the object's

        public String toString() {//overriding the toString() method
            return rollno + " " + name + " " + city;
        }


        public void main(String args[]) {
            Student s1 = new Student(101, "Hema", "Bangalore");
            Student s2 = new Student(102, "Chaitu", "Bangalore");

            System.out.println(s1); //compiler writes here s1.toString()
            System.out.println(s2); //compiler writes here s2.toString()
             s1.toString();

        }
    }
}
