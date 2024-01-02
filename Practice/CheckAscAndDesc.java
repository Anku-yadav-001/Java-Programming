package Practice;
import java.util.*;


public class CheckAscAndDesc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] myarray=new int[size];
        for(int i=0;i<size;i++)
        {
          myarray[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<size-1;i++)
        {
            if(myarray[i]>myarray[i+1])
            {
                isAscending=false;
            }
        }
        if(!isAscending)
        {
            System.out.println("The array is in Descending order");
        }
        else{
            System.out.println("The array is in Ascending order");
        }
    }
}
