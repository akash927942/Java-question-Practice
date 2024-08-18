package searching_Sort;

public class liner_search {
    public int liner(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                return i;


            }

        }
        return -1;


    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 48, 15, 51,  5, 400, 540, 50, 0, 540, 5, 54444, 548, 5248, 1, 54, 54, 9, 7641, 5};
        liner_search li=new liner_search();

        System.out.println(li.liner(arr,5));
    }
}


