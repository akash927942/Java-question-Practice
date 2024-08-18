package training;

public class Abstract {
    public static void main(String[] args){
        Firstt.m1();
        secondd.m1();

    }
}
abstract class Firstt{
    static void m1(){
        System.out.println("m1");
    }
}

class secondd extends Firstt
{
 static void m2(){
     System.out.println("m2");
 }
}