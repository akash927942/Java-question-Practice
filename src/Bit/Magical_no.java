package Bit;

public class Magical_no {
    public static void main(String[] args) {
        int i=4;
        int count=0;
        for (int b=1;b<=i;b++) {
            int a=b;
            int sum=0;
            while (a != 0) {
                int lb = a & 1;
                if (lb == 0) {
                    sum += 1;
                } else {
                    sum += 2;
                }
                a = a >> 1;
            }
            if (sum % 2 != 0) {
                System.out.println(b+" magical number");
                count++;
            } else {
                System.out.println(b+" not magical");
            }
        }
        System.out.println(count);
    }
}
