package Patterns;
import java.util.*;

public class Triangle0_1 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0)
                {
                    System.out.print('1');
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
