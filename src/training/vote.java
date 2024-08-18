package training;
import java.util.Scanner;
public class vote {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Alphabet");
        char ch=sc.next().charAt(0);
        Check p=new Check();
        p.isAlphabet(ch);
    }
}
class Check{
    void isAlphabet(char ch){
        if (ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            System.out.println("Alphabet");
        }
        else {
            System.out.println("not alphabet");
        }
    }
}