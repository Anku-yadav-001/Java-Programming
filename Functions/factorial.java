import java.util.*;
public class factorial {
        public static void printFactorial(int n)
        {
            if(n<0)
            {
                System.out.println("Please enter positive number");
               return;
            }
            int factorial=1;
            for (int i = n; i>=1; i--) {
                factorial=factorial*i;
            }
         System.out.println("The factorial of given number is: "+factorial);
        }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
       printFactorial(n);
    }
}
