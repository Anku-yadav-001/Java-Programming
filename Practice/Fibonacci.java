package Practice;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        if(n>1)
        {
            for(int i=2;i<=n;i++)
            {
                System.out.print(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
    }
}
