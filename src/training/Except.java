package training;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Except {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("enter two no.");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println("Result = " + z);
        }
//        catch (InputMismatchException e){
//            System.out.println("Exception : Invalid Input");
//        }
        catch (Exception e){
            System.out.println("Exception : handled");
        }

    }
}
