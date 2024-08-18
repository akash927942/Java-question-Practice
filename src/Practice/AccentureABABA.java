package Practice;

public class AccentureABABA {
    public static void main(String[] args) {

        int ans=0;

        String s = "abacaaa";
        System.out.println(s.substring(0,2));
        int n=3;
        // int g=s.length()

        for (int i=0;i<=s.length()-n;i++){
            String temp=s.substring(i,i+n);
            int idx=0;
            int count=0;

            idx=temp.indexOf('a');
            while (idx !=-1) {
                count++;
                idx = temp.indexOf('a', idx + 1);
            }
            if (ans<count){
                ans=count;
            }

        }
        System.out.println(ans);

    }
}
