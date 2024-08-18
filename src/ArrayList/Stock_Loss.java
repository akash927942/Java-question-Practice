package ArrayList;

public class Stock_Loss {
    public static void main(String[] args) {
        int a[]={5,4,5,6,2,1,5,3,7};
        int last=a[0];
        int count=0;
        for(int i=0;i<a.length;i++){
            if(last>a[i]){


                count++;
            }
            last=a[i];
        }
        System.out.println(count);
    }
}
