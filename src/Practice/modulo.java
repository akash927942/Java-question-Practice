package Practice;

public class modulo {
    public static void main(String[] args) {
        String s="1214515";
        int rem=0;
        for (int i=0; i<s.length();i++){
            int num=rem*10+(s.charAt(i)-'0');
            rem=num%7;
        }
        System.out.println(rem);
        System.out.println(1214515%7);
    }
}
