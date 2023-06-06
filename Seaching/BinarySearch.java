package Seaching;
import java.util.Scanner;
public class BinarySearch {
   /* iterative approach
   static int binarySearch(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid  = (low + high)/2;
            if(arr[mid]==x) {
                return mid;
            }
            else if(arr[mid]>x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }*/
    /*Recursive approach */
    static int binarySearch(int[] arr,int x, int low , int high){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
           return binarySearch(arr,x,low,mid-1);
        }
        else{
            return  binarySearch(arr,x,mid+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,23,30,45,50,65,70};
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the element to be searched in the array");
        int x = scan.nextInt();
        System.out.println("Idex of the element is "+binarySearch(arr,x,0,arr.length-1));
    }
}
