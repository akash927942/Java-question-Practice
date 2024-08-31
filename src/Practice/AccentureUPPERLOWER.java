package Practice;

public class AccentureUPPERLOWER {

    static String check(String a,String b){
        return a.toLowerCase()+" " +b.toUpperCase();
    }


    public static void main(String[] args) {
        String a="AkaSh";
        String b="kUMar";
        System.out.println(AccentureUPPERLOWER.check(a,b));
    }
}
