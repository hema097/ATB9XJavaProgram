package Nov.INHERITANCE.ex_01712024_SingleInheritance_ex3;



public class Python extends  Programming{
  void print(){
      System.out.println("Author");
      System.out.println("Version");

  }

  //default constructor
  Python(){
      System.out.println("dc");
  }

    public static void main(String[] args) {
        Python p1=new Python();
        System.out.println(p1.author);
        System.out.println(p1.version);


    }
}
