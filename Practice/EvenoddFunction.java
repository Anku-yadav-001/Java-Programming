package Practice;
import java.util.*;

public class EvenoddFunction {
    public static void printEvenOddNumber(int n)
    {
        if(n%2==0)
        {
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int inp=input.nextInt();
        printEvenOddNumber(inp);
    }
}
