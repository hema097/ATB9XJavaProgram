package Nov.MutlLevel_INHERITANCE;

public class Lab147_multilevel {
    public static void main(String[] args) {
        Child c1=new Child();// Child can access the Father and Grandfather Properties
        c1.child();
        c1.home();
        c1.extra();
        c1.gf();

        Father f1=new Father();  //Father can access the GrandFather properties
        f1.home();
        f1.extra();
        f1.gf();

        GrandFather g1=new GrandFather();  // Granfather can access only Grandfather properties only
        g1.home();
        g1.gf();
    }
}
