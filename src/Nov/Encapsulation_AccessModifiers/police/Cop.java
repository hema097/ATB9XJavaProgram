package Nov.Encapsulation_AccessModifiers.police;



public class Cop {

    private int gun;
    public String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }


}


