public class removeDuplicate {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicateFromAnArray(String str, int idx, String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']){
            removeDuplicateFromAnArray(str, idx+1, newStr);
        }else{
            newStr+=curr;
            map[curr-'a']=true;
            removeDuplicateFromAnArray(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str="aabcedd";
        removeDuplicateFromAnArray(str, 0, "");
    }
}
