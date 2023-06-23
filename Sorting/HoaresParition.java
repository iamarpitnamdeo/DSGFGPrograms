package Sorting;

public class HoaresParition {
    static int hoaresPartition(int [] arr){
        int low = 0;
        int high = arr.length-1;
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{5,3,8,4,2,7,1,10};
        System.out.println(hoaresPartition(arr));
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
}
