package training;

public class Code{
    public static void main(String[] args){
        //Test.fun();
    Threee t=new Threee();
    t.abc();
    t.fun();
    Testtt t1=new Threee();
    t1.fun();



    }
}
interface Testtt
{
    void fun();
}
interface two {
    void abc();
}
class Threee implements two,Testtt {
    public void fun(){
        System.out.println("fun");}

  public void abc()
  {
    System.out.println("abc");
}
}


