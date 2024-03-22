package Inheritance;


public class Inheritance {
    int l;
    int w;
    int h;
    Inheritance(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    Inheritance(int side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    Inheritance(int l,int w,int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Inheritance(Inheritance side){
        this.l=side.l;
        this.w=side.w;
        this.h=side.h;
    }
    
}
