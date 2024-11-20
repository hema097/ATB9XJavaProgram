package Nov.Encapsulation;

public class Lab153_Encap_practice {

    public static void main(String[] args) {
        Person p1=new Person("Hema","123");
        String pass= p1.getName(false);
        System.out.println(pass);

       String pass1=p1.getPhone_no();
        System.out.println(pass1);

//if u want to set a Name
        String sn=p1.setName("Hemavathi123");
        System.out.println(sn);


    }
}
//step1:Private nature the variables
class Person{
     private String name;
     private  String phone_no;

 //Step 2: generate a costructr

    public Person(String name, String phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }

    public String getName(boolean isemployee) {
        if (isemployee) {
            return name;
        }
        return "Not Employee";
    }
//Set name Constructor
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}
