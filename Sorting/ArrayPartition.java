package Sorting;

public class ArrayPartition {
    static void pivotPartition(int [] arr, int p){
        int l = 0;
        int h = arr.length-1;
        int index =0;
        int [] temp = new int [h-l+1];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<=arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l ; i<=h;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,13,6,9,12,11,8};
        pivotPartition(arr,6);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
