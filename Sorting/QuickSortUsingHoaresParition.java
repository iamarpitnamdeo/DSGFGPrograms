package Sorting;

public class QuickSortUsingHoaresParition {
    static int hoaresPartition(int []arr, int low, int high){
        int pivot = arr[low];
        int i= low-1;
        int j = high +1;
        while(true){
            do{
                i++;
            }while (arr[i]<pivot);
            do{
                j--;
            }while (arr[j]>pivot);
            if(i>=j)
                return j;

            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
        }
    }
    static void quickSort(int [] arr,int low, int high){
        if(low<high){
            int p = hoaresPartition(arr,low , high);
            quickSort(arr,low,p);
            quickSort(arr,p+1,high);
        }
       /* if (low < high) {
            int p = hoaresPartition(arr, low, high);
            quickSort(arr, low, p);
            quickSort(arr, p + 1, high);
        }*/

    }

    public static void main(String[] args) {
        int []arr = new int[]{8,4,7,9,3,10,5};
        quickSort(arr,0,arr.length-1);
        for(int j : arr){
            System.out.print(j + " ");
        }
    }
}
