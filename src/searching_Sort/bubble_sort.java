package searching_Sort;

public class bubble_sort {
    public void bubble(int[] arr){

        for (int i=0;i< arr.length-1;i++){

            for (int j=0;j< arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }


        }

    }
    public static void main(String [] args){
        int[] arr={52,65,6,499,1,359,4,623,8,654,64,999};
        bubble_sort b=new bubble_sort();
        b.bubble(arr);

        for (int i=0;i< arr.length-1; i++){
            System.out.print(arr[i] +" , ");
        }
    }

}
