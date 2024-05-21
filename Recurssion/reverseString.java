//Reverse string using recurssion
// time complexity- string.length
//                 O(n) n= length of string

public class reverseString {
    public static void revStr(String str, int inx){
        if(inx==-1){
            return;
        }
        System.out.print(str.charAt(inx));
        revStr(str, inx-1);
    }
    public static void main(String[] args) {
        String str="aman";
        revStr(str, str.length()-1);
    }
}
