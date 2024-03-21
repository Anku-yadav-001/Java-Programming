

public class inheritance1 {
    public static void main(String[] args) {
    //object for no arguments
        Inheritance obj1=new Inheritance();
        System.out.println(obj1.l+" "+obj1.w+" "+obj1.h);
    //object for single argument
        Inheritance obj2=new Inheritance(5);
        System.out.println(obj2.l+" "+obj2.w+" "+obj2.h);
    //object for three arguments
        Inheritance obj3=new Inheritance(3,4,6);
        System.out.println(obj3.l+" "+obj3.w+" "+obj3.h);
    //object for the copy of another object
        Inheritance obj4=new Inheritance(obj2);
        System.out.println(obj4.l+" "+obj4.w+" "+obj4.h);
    
    //object for weight ie. in another class
        Weight obj5=new Weight();
        System.out.println(obj5.l+" "+obj5.w+" "+obj5.h+" "+obj5.weight);

    //object for inherit the properties
       Weight obj6=new Weight(5,6,7,6);
       System.out.println(obj6.l+" "+obj6.w+" "+obj6.h+" "+obj6.weight);

    //copy constructor with the super class
        Weight obj7=new Weight(obj6);
        System.out.println(obj7.weight);
    }
}
