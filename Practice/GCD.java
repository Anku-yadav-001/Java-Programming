package Practice;
import java.util.*;
public class GCD{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        while (a!=b) {
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("GCD number: "+b);
    }
}