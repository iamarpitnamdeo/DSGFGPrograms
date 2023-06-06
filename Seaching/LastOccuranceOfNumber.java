package Seaching;

public class LastOccuranceOfNumber {
    static int lastOccurance(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low +high)/2;
            if(arr[mid]==x){
                if(mid== arr.length-1||arr[mid+1]!=arr[mid]){
                    return mid;
                }
                else
                    low=mid+1;
            } else if (arr[mid]>x) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,10,20,20,20,30,30,40,40,40};
        System.out.println("Last occurance of the number is at pos"+lastOccurance(arr,20));
    }
}
