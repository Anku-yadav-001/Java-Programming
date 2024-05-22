public class printSubsequences {
    
    public static void subsequences(String str, int idx, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curr=str.charAt(idx);
        subsequences(str, idx+1, newStr+curr);
        subsequences(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str="abc";
        subsequences(str, 0, "");
    }
}
