package String;

public class fav_playlist {
    public static void main(String[] args) {
        String s="akasahaa";
        int n=4;
        int count=0;

        for (int i=0,j=n-1;j<s.length();i++,j++){
            int temp=0;
            for (int x=i;x<=j;x++){
                if(s.charAt(x)=='a'){
                    temp++;
                }
            }
            if (temp>count){
                count=temp;
            }
        }
        System.out.println(count);
    }
}
