package String;

public class Frequecy_Count {
    public static void main(String[] args) {
        String s="babdc";
        int ar[]=new int[26];
        for (int i=0;i<s.length();i++){
            int n=(s.charAt(i)-'a');
            ar[n]++;
        }
        for (int j=0;j<ar.length;j++){
            if (ar[j]>0) {
                char c =(char)(j +'a');
                System.out.print(c);
                System.out.print(ar[j]);
            }

        }
    }
}
