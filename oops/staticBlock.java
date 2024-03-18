public class staticBlock {
    static int a=10;
    static int b;
    static{
        System.out.println("I am in static block");
        b=a*2;
    }
    public static void main(String[] args) {
        staticBlock obj1=new staticBlock();
        System.out.println(obj1.a+" "+obj1.b);

        staticBlock obj2=new staticBlock();
        staticBlock.a+=2;
        System.out.println(obj2.a+" "+obj2.b);
    }
}
