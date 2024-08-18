package Bit;


public class BItOperation {
    public static void main(String[] args) {
//        – A denotes AND operation
//        – B denotes OR operation
//        – C denotes XOR Operation
        String s="0C1A1B1C1C1B0A0";
       // System.out.println((int)s.charAt(4));
        int ans=s.charAt(0)-'0';;
        ///char t=s.charAt(1);
        for (int i=1;i<s.length()-1;i++){
            char c=s.charAt(i);
            char v=s.charAt(i+1);
            int n=v -'0';
            //System.out.println(c+" "+n+" "+ans);
            if (c=='A'){

                ans=(ans & n);

            } else if (c=='B') {
                ans = ans | n;


            }
            else if(c=='C') {
                ans = ans ^ n;

            }
            i++;
        }
        System.out.println(ans);


    }
}
