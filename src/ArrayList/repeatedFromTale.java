package ArrayList;

public class repeatedFromTale {
    public static void main(String[] args) {
        int []a={1,2,3,1,2,3,5,8};

        int ans=0;
        boolean get=false;
        for (int i=a.length-1;i>=0;i--){

            for (int j=0;j<i;j++){
                if (a[i]==a[j]){
                    ans=a[i];
                    get=true;
                    break;
                }

            }
            if (get==true){
                break;
            }
        }
        System.out.println(ans);
    }
}
