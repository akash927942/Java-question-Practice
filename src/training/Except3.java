package training;

public class Except3 {
    public static void main(String[] args){
        String s="22";
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        }
        catch (NumberFormatException e){
            System.out.println("Exception");
        }
    }
}
