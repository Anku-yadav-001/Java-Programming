//Tower of Hanoi
//Time complexity-O(n^2)
public class towerOfHanoi {
    public static void towerhanoi(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Transfere "+n+" disk from "+src+" to "+dest);
            return;
        }
        towerhanoi(n-1,src, dest,help);
        System.out.println("Transfere "+n+" disks from "+src+" to "+dest);
        towerhanoi(n-1, help,src,dest);
    }
   public static void main(String[] args) {
       int n=3;
       towerhanoi(n, "S", "H", "D");
   }
    
}