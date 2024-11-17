package Nov.Encapsulation;

public class Lab152_encapsulation {

    public static void main(String[] args) {
//        VWOLogin vwo=new VWOLogin("admin","password123");
//        System.out.println(vwo.password);//Now password is visible
//
//        vwo.password="hacker";   //now we set the password
//        System.out.println(vwo.password);  //the above password is visible here this not secure

        GoodVWOLogin vwologin1=new GoodVWOLogin("goodadmin","Admin12345");
//        System.out.println(vwologin1.password);
//        vwologin1.password="Aadmin";

//        String pass=vwologin1.giveMePassword(false);
//        System.out.println(pass);
     String pass=vwologin1.getPassword(false);
     //vwologin1.setPassword("Hema@123");
        System.out.println(pass);


    }
}

class VWOLogin{
    public  String username;
    public  String password;

    VWOLogin(String username,String password){
        this.username=username;
        this.password=password;
    }
}

//Encapsulation If i declared private as its protected the PW in Main class
class GoodVWOLogin {
    private String username;
    private String password;

    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAdmin) {
        if (isAdmin) {
            return password;
        }
        return "Not Allowed";
    }
//If no one set the Password means we need delete the below function

    public void setPassword(String password) {
        this.password = password;
    }
//    public String giveMePassword(boolean isAuth) {
//        if(isAuth){
//            return username;
//        }
//        return "none";
//
//    }
}
