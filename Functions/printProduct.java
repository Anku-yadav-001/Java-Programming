import java.util.*;
public class printProduct {
    public static int printProductFunction(int a, int b)
    {
        int product= a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int product1=printProductFunction(a, b);
        System.out.println(product1);
    }
}
