package ArrayList;

public class consLeastAdd {
    public static void main(String[] args) {
        int []a={1,2,-5,4,5,7,-5,55};

        System.out.println();
        int n=3;
        int f=0;
        int s=0;
        int t=0;
        int sum=Integer.MAX_VALUE;
        for (int i=2;i<a.length;i++){
            int tm=a[i-2]+a[i-1]+a[i];
            if(tm<sum) {
                sum = tm;
                f = a[i - 2];
                s = a[i - 1];
                t = a[i];
            }

        }
        System.out.println(sum);
        System.out.println(f+","+s+","+t);
    }
}
