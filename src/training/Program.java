package training;

public class Program {
    public static void main(String [] args){
        System.out.println("hii");
        Emp e=new Emp();
        e.setId(588);


        System.out.println(e.getId());


    }
}
class Emp{
    private  int id;
    private static String name;
    private static double salary;

    public void setId(int id){
    this.id=id;
    }
    public static void setName(String name){
        Emp.name=name;
    }public static void setSalary(double salary){
        Emp.salary=salary;
    }
    public static String getName(){
        return Emp.name;
    }
    public  int getId(){
        return id;
    }
    public static double getSalary(){
        return Emp.salary;
    }
}
