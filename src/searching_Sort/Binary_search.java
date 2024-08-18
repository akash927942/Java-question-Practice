package searching_Sort;



public class Binary_search {
    public int Binary(int[]arr,int target){
        int start=0;
        int last=arr.length-1;
        while (start<=last){
            int mid=(start+last)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                last=mid-1;

            } else if (arr[mid]<target) {

                start=mid+1;
            }
        }
        return -1;
    }


}
class bs{
    public static void main(String [] args){
        int[] arr={1,2,3,4,5,6,5,8};
        Binary_search b=new Binary_search();
        System.out.println(b.Binary(arr,4));



    }
}
