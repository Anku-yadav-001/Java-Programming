package Inheritance;


public class Weight extends Inheritance{
    int weight;
    Weight(){
        this.weight=-2;
    }
    Weight(int l, int b,int h,int weight){
        super(l,b,h);
        this.weight=weight;
    }
    Weight(Weight other){
        super(other);
        weight=other.weight;
    }
}
