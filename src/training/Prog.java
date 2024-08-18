package training;

public class Prog {
    public static void main(String [] args){
        Test t1= new Test(10,20);
        System.out.println(t1);
    }
}
class  Test
{
    private int a , b;
    public Test(int a , int b)
    {
        this.a=a;
        this.b=b;


    }
    public String toString(){
        return  "a and b " + this.a ;
    }

}
