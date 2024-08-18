package ArrayList;

public class Euilibrium {
    public static void main(String[] args) {
        int [] a={1,2,3,5,2,1,1,1,1};
        int n=a.length;
        if (n<=2){
            System.out.println("not Possible");
            //break or return;
        }
        int fs=a[0];
        int ls=0;
        for (int y=(n-1);y>1;y--){
            ls += a[y];
        }

        for (int i=2;i<n-1;i++){

            if (fs==ls){
                System.out.println(a[i-1]);
                break;
            }
            fs +=a[i-1];
            ls -=a[i];

        }
    }
}
