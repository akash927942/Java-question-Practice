package fraction;
import java.util.Scanner;
import java.util.*;

public class fractionuse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        fraction f1=new fraction();
//        f1.numerator=10;
//        f1.denominator =20;
//        f1.print();
//        System.out.println("enter numerator");
   //     int nem= 10;
//        System.out.println("enter denominator");
 //       int den= 0;
//        fraction f2=new fraction(nem,den);
//        System.out.println(f2);
//        f2.print();
//       f2.setden(0);
////        f2.print();
//        f2.print();

        fraction f1=new fraction();
        f1.setnum(50);
        try {
            f1.setden(0);
        }catch (ZeroException e){
            System.out.println("fuck");
        }
        finally {

        }
        f1.print();



    }


}
