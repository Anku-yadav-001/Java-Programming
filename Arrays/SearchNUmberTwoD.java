import java.util.*;
public class SearchNUmberTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int coln=sc.nextInt();
        int[][] array=new int[row][coln];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coln;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coln;j++)
            {
                if(x==array[i][j])
                {
                    System.out.println("the value of x is at "+i+" and "+j);
                }
            }
        }
    }
}
