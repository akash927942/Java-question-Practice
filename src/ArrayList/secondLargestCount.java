package ArrayList;

public class secondLargestCount {
    public static void main(String[] args) {
        int [] a={1,2,3,4,4,4,5,5,5,5,5,6,6,6,6};
        int lar=a[a.length-1];

        for (int i=a.length-1;i>=0;i--){
            if (lar>a[i]){
                lar=a[i];
                break;
            }
        }
        System.out.println(lar);
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==lar){
                count++;
            }
        }
        System.out.println(count);
    }
}
