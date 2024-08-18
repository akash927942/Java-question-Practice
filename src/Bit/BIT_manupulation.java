package Bit;

public class BIT_manupulation {
    public static void main(String[] args) {
        int num=70;
        int i=3;
        //Get ith bit
        System.out.print((num >> (i-1) & 1) +" ");
        //Set ith Bit
        System.out.print((1<<(i-1) | num) +" ");
        //clear ith bit
        System.out.print((~(1<<(i-1)) & num));
        //Toggle ith bit
        System.out.println(num ^ (1<<(i-1)));

    }
}
