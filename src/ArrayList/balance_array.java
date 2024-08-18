package ArrayList;

public class balance_array {
    public static void main(String[] args) {
        int []arr={-7,1,5,2,-4,3,0};
        int sl=arr[0];
        int sr=arr[arr.length-1];
        int count=1;

        for (int i=1, j= arr.length-2;i<arr.length;i++,j--){
            if(sl==sr){
                System.out.println(count);
                break;
            }
            else {
                count++;
                sl +=arr[i];
                sr +=arr[j];
            }
        }
    }
}
