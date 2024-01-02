package Practice;
import java.util.*;
public class drivenmenu {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int input=inp.nextInt();
        do{
            
            if(input==1){
                 int score=inp.nextInt();
            if(score>=90)
            {
                System.out.println("greate you have got A+ gread");
            }
            else if(score<=90 && score>=70)
            {
                System.out.println("average");
            }
            else{
                System.out.println("Poor");
            }
            }
        }while(input>1);
           
      
    }
}
