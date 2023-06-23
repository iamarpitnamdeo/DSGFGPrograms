package Sorting;

public class SortArrayWithThreeTypes {
    static void swap(int []arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortArrayThreeTypes(int [] arr){
        int low=0;
        int high = arr.length-1;
        int mid = 0;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid ,low);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else {
                swap(arr,mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = new int []{0,1,2,1,1,2,0,2,1};
        sortArrayThreeTypes(arr);
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}
