//If Else

package conditionalStatements;
import java.util.*;
class if_else{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        // int age=inp.nextInt();
        // if(age>18)
        // {
        //     System.out.println("You are an adult");
        // }
        // else{
        //     System.out.println("You are not an adult");
        // }

    //    int num=inp.nextInt();
    //    if(num%2==0)
    //    {
    //         System.out.println("Number is even");
    //    }
    //    else{
    //     System.out.println("Number is odd");
    //    }

        int a=inp.nextInt();
        int b=inp.nextInt();
        if(a==b)
            {
                System.out.println("Both are equal");
            }
        else{
            if(a>b)
        {
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        }
        
    }
}