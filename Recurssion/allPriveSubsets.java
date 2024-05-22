import java.util.ArrayList;

public class allPriveSubsets {

    public static void displaySubs(ArrayList<Integer>subset){
        for(int i=-0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void printSubsets(int n,ArrayList<Integer> subset){
        if(n==0){
            displaySubs(subset);
            return;
    }
        subset.add(n);
        printSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        printSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        printSubsets(n,subset);
    }
}
