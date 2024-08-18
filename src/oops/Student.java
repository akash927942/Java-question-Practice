package oops;

public class Student {
//    String name;
//    int roll;
//    Student(int rn){
//        roll=rn;
//    }
//    public void set(int rn){
//        if(rn<0){
//            return;
//        }
//        else {
//            roll = rn;
//        }
//    }
//
//    public void print(){
//        System.out.println(name+" "+roll);
//    }
//
//}

    int a;
    int b;
    Student()
    {
        this(10, 20);
        System.out.print("constructor one ");
    }
    Student(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.print("constructor two ");
    }
}
