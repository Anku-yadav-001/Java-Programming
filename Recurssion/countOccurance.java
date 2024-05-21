//count the occurence of element
//Time complexity-O(n) n=length of string

public class countOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void findCount(String str, int idx, char element){
        if(idx==str.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if(element==str.charAt(idx)){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }

        findCount(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str="bafhsgravjjskag";
            findCount(str, 0 , 'a');
    }
}
