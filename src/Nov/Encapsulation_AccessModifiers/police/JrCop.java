package Nov.Encapsulation_AccessModifiers.police;

import Police.Cop;

public class JrCop {
    public static void main(String[] args) {
        Cop jrcop=new Cop(5);
        //System.out.println(jrcop.gun);
        jrcop.canishoot();
    }
}
