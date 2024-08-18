package training;

public class Inheritance {
    public static void main(String [] args){
        Second s= new Second();
        s.m2();
        //Second.m2();
        s.m1();
    }
}
class First
{
    void m1(){
        System.out.println("m1");
    }
}
class Second extends First
{
    void m2(){
        System.out.println("m2");
    }
}
