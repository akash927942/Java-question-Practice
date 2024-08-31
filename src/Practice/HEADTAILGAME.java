package Practice;

public class HEADTAILGAME {
    public static void main(String[] args) {
        String s="HTHHTTHTHHHT";
        System.out.println(HEADTAILGAME.ht(s));
    }
    static int ht(String s){
        int ans=0;

        int count=0;
        for (char c:s.toCharArray()){
            if (count==3){
                return ans;
            }
            if (c=='H'){
                ans +=2;
            }
            else {
                ans -=1;
                count=0;
            }
        }


        return ans;
    }
}
