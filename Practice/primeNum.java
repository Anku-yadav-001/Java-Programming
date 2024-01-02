package Practice;
import java.util.*;
public class primeNum {
    public static void printPrimeNUmber(int n)
    { 
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            if(n==1)
            {
                System.out.println("the number is not prime or not composite");
            }
            else{
                System.out.println("The number is prime ");
            }
        }
        else{
            System.out.println("The number is not prime");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        printPrimeNUmber(n);
    }
}
