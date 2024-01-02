import java.util.*;

public class printSum {
    public static int printSumFunction(int a, int b)
    {    
        int sum;
        sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
      int sum= printSumFunction(a, b);
      System.out.println(sum);
    }
}
