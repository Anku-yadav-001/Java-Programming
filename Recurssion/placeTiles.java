public class placeTiles {
    
    public static int placeMNTiles(int n, int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        
        int vertically=placeMNTiles(n-m, m);
        int horizontally=placeMNTiles(n-1, m);

        return vertically+horizontally;
    }
    public static void main(String[] args) {
        int m=2,n=4;
        System.out.println(placeMNTiles(n, m));
    }
}
