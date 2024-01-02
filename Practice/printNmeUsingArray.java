package Practice;
import java.util.*;
public class printNmeUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] name=new int[size];
        for(int i=0;i<size;i++)
        {
            name[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<size;i++)
        {
            if(name[i]<min)
           {
             min=name[i];
           }
           if(name[i]>max){
            max=name[i];
           }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println(("Minimum number is: "+min));

    }
}
