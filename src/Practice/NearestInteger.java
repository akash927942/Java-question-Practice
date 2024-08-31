package Practice;

public class NearestInteger {
    public static void main(String[] args) {
        int num=26;
        int m=3;

        int min=0;
        int max=0;

        for (int i=num;i>+m;i--){
            if (i%m==0){
                min=i;
                break;
            }
        }
        for (int i=num;;i++){
            if (i%m==0){
                max=i;
                break;
            }
        }
        int ans=0;
        if (num-min<=num-max){
            ans=min;

        }
        else {
            ans=max;
        }
        System.out.println(min +" "+max);
        System.out.println(ans);
    }
}
