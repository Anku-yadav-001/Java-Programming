package Practice;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        System.out.println("Type 1(+),2(-),3(*),4(/),5(%)");
        int num=inp.nextInt();
        switch(num)
        {
            case 1:System.out.println(a+b);
            break;
             case 2:System.out.println(a-b);
            break;
             case 3:System.out.println(a*b);
            break;
             case 4:System.out.println(a/b);
            break;
             case 5:System.out.println(a%b);
            break;
            default:System.out.println("Please enter valid number");
        }
    }
}
