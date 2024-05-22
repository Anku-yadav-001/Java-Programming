//time complexity -O(n)
public class moveAllXatEnd {

    public static void moveAllA(String str, int idx, int count, String newStr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }

        char curr=str.charAt(idx);
        if(curr=='x'){
            count++;
            moveAllA(str, idx+1, count, newStr);
        }else{
            newStr+=curr;
            moveAllA(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str="axxbxxecs";
        moveAllA(str, 0, 0, "");
    }
}
