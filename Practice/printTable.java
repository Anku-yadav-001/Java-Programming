package Practice;
import java.util.*;
public class printTable {
    public static void printGivenNumberTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+" = "+n*i);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        printGivenNumberTable(n);
    }
}
