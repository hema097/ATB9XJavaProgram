package Oct.ex_22102024_While;

public class Lab108_while_interview {
    public static void main(String[] args) {
        int i=0;
        while(i < 0){
            System.out.println(i);
            i++;
        }
        System.out.println("Condition is failed");
    }
}
//Nothing will e prinited because 0<0 condition is failed it will out the loop