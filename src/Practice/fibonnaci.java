package Practice;

public class fibonnaci {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(fibonnaci.fib(n));

    }

    static int fib(int a) {
        if (a == 1) {
            return 1;
        }
        int suqm = 2;
        int pre = 1;
        int pp=0;
        for (int i = 1; i < a; i++) {
           // System.out.println(pp+pre);
            int sum=pp+pre;
            pp=pre;
            pre=sum;


        }
        return pre;

    }
}
