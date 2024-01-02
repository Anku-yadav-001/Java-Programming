package Patterns;
import java.util.*;
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i+1;j++)
            {
                 System.out.print("*");   
            }
            System.out.println();
        }
    }
}
