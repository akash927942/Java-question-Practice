package training;

public class Interface {
    public static void main(String[] args){
        Fst f=new Sec();
        f.m1();
        f.m2();
        Sec s=new Sec();
        s.m3();
    }
}

interface Fst
{
    void m1();
    void m2();

}
class Sec implements Fst
{
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    public void m3(){
        System.out.println("m3");
    }
}
