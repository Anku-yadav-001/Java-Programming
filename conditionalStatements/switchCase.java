//Switch case

package conditionalStatements;
import java.util.*;
public class switchCase {
   public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        switch(num)
        {
        case 1: System.out.println("hello");
        break;
            case 2: System.out.println("hy");
        break;
            case 3: System.out.println("namsate");
        break;
            case 4: System.out.println("great");
        break;
        default:System.out.println("please enter valid number");
        
        }
   }
}
