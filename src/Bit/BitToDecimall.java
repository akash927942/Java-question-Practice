package Bit;

public class BitToDecimall {
    public static void main(String[] args) {
//        int a=5;
//        int count=0;
//
//        while(a!=0){
//            if ((a&1)==1){
//                count++;
//            }
//            a=a>>1;
//        }
//
//        int ans=0;
//        int binaryDigit=1;
//        int power=0;
//        for (int i=0;i<count;i++){
//
//            ans+=binaryDigit*Math.pow(2,power);
//            power++;
//        }
//        System.out.println(ans);



        String s="1010";
        int power=0;
        int ans=0;

        for (int i=s.length()-1;i>=0;i--){
            int x=s.charAt(i)-'0';
//            System.out.println(x);
            ans +=x*Math.pow(2,power);
            power++;
        }
        System.out.println(ans);
    }
}
