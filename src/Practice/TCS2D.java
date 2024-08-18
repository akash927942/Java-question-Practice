package Practice;

public class TCS2D {
    public static void main(String[] args) {

        int ar[][] = {{0, 1, 0}, {1, 0, 1}, {1, 1, 1}};
        int max=0;
        int idx=0;
        for(int i=0;i< ar.length;i++){
            int sum=0;
            for (int j=0;j<ar.length;j++){
                sum +=ar[i][j];
            }
            if (max<sum){
                max=sum;
                idx=i;
            }
        }
        System.out.println(idx+1+ " " + max);

    }
}
