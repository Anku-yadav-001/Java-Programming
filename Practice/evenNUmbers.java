package Practice;
import java.util.*;
public class evenNUmbers {
   public static void main(String[] args) {
      Scanner inp=new Scanner(System.in);
      int num=inp.nextInt();
      for(int i=1;i<=num;i++)
      {
        if(i%2==0)
        {
            System.out.println(i);
        }
      }
   }
}
