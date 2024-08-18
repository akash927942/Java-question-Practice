package training;

public class mainn {
    public static void main(String [] args){
        System.out.println("akash");
        Say s=new Say();
        s.hiToAll();
        Clear.everyOne();
    }
}

class Say{
    void hiToAll(){
        System.out.println("hii to all");
    }
}
class Clear
{
    static void everyOne(){
        System.out.println("Clear all");
    }
}
