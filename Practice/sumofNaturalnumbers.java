package Practice;
import java.util.*;
public class sumofNaturalnumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++)
        {
                sum=sum+i;
        }
        System.out.println(sum);
    }
}
