package Seaching;

public class FirstOccuranceOfNumber {
    /*recursive approach
    static int firstOccurance(int[] arr,int x, int low,int high){
        if(low>high){
            return -1;
        }
        int mid = (low + high)/2;
        if (arr[mid]==x){
            if (mid==0||arr[mid-1]!=arr[mid])
                return mid;
            else
                return firstOccurance(arr,x,low,mid-1);
        } else if (arr[mid]>x) {
            return firstOccurance(arr,x,low,mid-1);
        }else {
            return firstOccurance(arr,x,mid+1,high);
        }
    }*/
    //  Iterative approach
    static int firstOccurance(int[] arr,int x){
        int low=0;
        int high= arr.length-1;
        while (low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                }
                else
                    high = mid-1;
            } else if (arr[mid]>x) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{10,10,20,20,20,30,30,40};
        System.out.println("first occurance of the number is at pos"+firstOccurance(array,40));
    }
}
