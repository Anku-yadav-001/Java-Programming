
public class factorial {
    public static void printFatorial(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact=fact*n;
        printFatorial(n-1,fact);
    }
    public static void main(String[] args) {
        int n=0;
        printFatorial(n,1);
    }
}
