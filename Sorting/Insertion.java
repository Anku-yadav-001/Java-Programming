package Sorting;
public class Insertion {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,4,5};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int positon=i-1;
            while (positon>=0 && current<arr[positon]) {
                   arr[positon+1]=arr[positon];
                   positon--;
            }
            arr[positon+1]=current;
        }
        printArray(arr);
    }
}
