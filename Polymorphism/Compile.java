public class Compile {
    int a;
    int b;
    int c;
    //default constructor
    Compile(){
        this.a=-1;
        this.b=-1;
        this.c=-1;
    }

    //parametrized constructor
    Compile(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
}
//here the above to constructors, same name but different list of parameters that is compile time polymorphism