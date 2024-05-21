
public class fibonnachi {

    public static void printFib(int n, int a, int b){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFib(n-1, b, c);
    }
    public static void main(String[] args) {
        System.out.println("0");
        System.out.println("1");
        int n=7;
        printFib(n-2,0,1);
    }
}
