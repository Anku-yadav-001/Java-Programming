
public class second {
    public static void printNums(int n){
        if(n==11){
            return;
        }
        System.out.println(n);
        printNums(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNums(n);
    }
}
