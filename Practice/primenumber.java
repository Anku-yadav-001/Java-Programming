package Practice;
import java.util.*;
public class primenumber {
  public static void main(String[] args) {
      Scanner inp=new Scanner(System.in);
        int input=inp.nextInt();
        for(int i=1;i<=input;i++)
        {
            if(i%2==0 && input%i==0)
                System.out.println(i);
        }
  }
}
