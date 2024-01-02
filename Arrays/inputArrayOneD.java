// package Arrays;
import java.util.*;
public class inputArrayOneD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] myArray=new int[size];
        for(int i=0;i<size;i++)
        {
            myArray[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("The element of array at "+i+" is "+myArray[i]);
        }
    }
}
