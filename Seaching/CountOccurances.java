package Seaching;
import java.util.Scanner;
public class CountOccurances {
    static int countFirstOccurance(int [] arr,int x){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid = (low+high) /2;
            if(arr[mid]==x) {
               if (mid==0||arr[mid-1]!=arr[mid])
                   return mid;
               else
                   high=mid-1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
    static int countLastOccurance(int [] arr,int x){
        int low=0;
        int high = arr.length-1;
        while (low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==x){
                if (mid==arr.length-1||arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else {
                    return low=mid+1;
                }
            } else if (arr[mid]>x) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
    static int countOcc(int [] arr,int x){
        int first = countFirstOccurance(arr,x);
        if(first == -1) {
            return 0;
        }
        else {
            int last = countLastOccurance(arr, x);
            return (last-first)+1;
        }
    }
    public static void main(String[] args) {
        int[] arr  = new int[]{11,11,12,12,12,12,23,23,25,26};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number to find the occurances");
        int n = scan.nextInt();
        System.out.println("total occurances of number "+n+" are "+countOcc(arr,n));
    }
}
