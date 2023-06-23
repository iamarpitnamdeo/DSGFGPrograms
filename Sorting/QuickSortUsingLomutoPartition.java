package Sorting;

public class QuickSortUsingLomutoPartition {

    static int lomutoPartition(int [] arr, int l , int h){
       int i=l-1; int pivot=arr[h];
       for (int j=l;j<h;j++){
           if(arr[j]<pivot){
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j]=temp;
           }
       }
        int temp = arr[i+1];
        arr[i+1]= arr[h];
        arr[h]=temp;
        return i+1;
    }
    static void quickSort(int []arr, int l, int h){
        if(l<h){
            int p = lomutoPartition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8,4,7,9,3,10,5};
        quickSort(arr,0,arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
