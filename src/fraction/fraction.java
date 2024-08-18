package fraction;
import java.util.*;
public class fraction {
    private int numerator;
    private int denominator;

    public fraction(int num,int den){
        this.numerator=num;
        this.denominator =den;
        simplify();
    }
    public fraction(){
        simplify();
    }
    public void setnum(int num){
        this.numerator=num;

    }
    public void setden(int den) throws ZeroException{
        if (den ==0) {
            ZeroException e = new ZeroException();
            throw e;
        }
        else{
                this.denominator = den;
            }
    }
    public void simplify(){
        int y=1;
        int min=Math.min(numerator,denominator);
        for(int x=2;x<=min;x++){
            if(numerator % x==0 && denominator % x==0){
                y=x;
            }
        }
        this.numerator=numerator/y;
        this.denominator=denominator/y;
    }



public void print() {



    if (denominator==1) {
        System.out.println(numerator);
    } else {
        System.out.println(numerator+"/"+ denominator);
    }
}
}
