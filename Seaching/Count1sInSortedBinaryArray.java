package Seaching;

public class Count1sInSortedBinaryArray {
    static int noOf1s(int[] arr){
        int low=0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==0){
                low = mid+1;
            }
            else {
                if(mid==0||arr[mid-1]==0)
                    return arr.length-mid;
                else
                    high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{0,0,0,1,1,1,1,1,1};
        System.out.println("Numbers of 1s available in the array are "+noOf1s(arr));
    }
}
