
public class natural {
    public static void printNatural(int i, int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printNatural(i+1, n, sum);
    }
    public static void main(String[] args) {
        printNatural(1,10, 0);
    }
}
