//Function:=A function is a block of code that performs a specific task. 

import java.util.*;

public class printMyname {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String fname=inp.next();
        printName(fname);
    }
}
