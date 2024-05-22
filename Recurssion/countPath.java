public class countPath {
    
    public static int countNoPath(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1  && j==m-1){
            return 1;
        }
        int downwords=countNoPath(i+1, j, n, m);
        int backword=countNoPath(i, j+1, n,m);

        return downwords+backword;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        int result=countNoPath(0, 0, n, m);
        System.out.println(result);
    }
}
