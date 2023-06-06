package Seaching;

public class PeakElement {
    static int peakElement(int [] arr){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if ((mid==0|| arr[mid] >= arr[mid - 1] )&& (mid==arr.length-1||arr[mid] >= arr[mid+1])) {
                return mid;
            }
            if(mid>0&&arr[mid-1]>=arr[mid]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{5,20,40,30,20,50,60};
        System.out.println("Peak element of the above array is :"+peakElement(arr));
    }
}
