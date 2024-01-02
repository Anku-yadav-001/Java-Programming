//Arrays:=Arrays in Java are like a list of elements of the same type i.e. 
          //a list of integers, a list of booleans etc. 

// package Arrays;

public class marksOneD {
    public static void main(String[] args) {
        // int[] marks=new int[3];   //1-way(declaration)
        // int marks[]=new int[3];  //2-way(declaration)
        // marks[0]=20;    
        // marks[1]=34;
        // marks[2]=35;

        int marks[]={20,34,35};   //3-way(initilization)
       
        // System.out.println("Marks of physics "+marks[0]);
        // System.out.println("Marks of chemistry "+marks[1]);
        // System.out.println("Marks of english "+marks[2]);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
