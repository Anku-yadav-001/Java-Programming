import java.util.HashSet;

public class uniqueSubsequances {
    
    public static void uniqueSubs(String str, int idx, String newStr, HashSet<String> set){
            if(idx==str.length()){
                if(set.contains(newStr)){
                    return;
                }
                else{
                    System.out.println(newStr);
                    set.add(newStr);
                    return;
                }
            }
        char curr=str.charAt(idx);
        uniqueSubs(str, idx+1, newStr+curr, set);
        uniqueSubs(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        uniqueSubs(str, 0, "", set);
    }
}
