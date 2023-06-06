package Seaching;
import java.util.Scanner;
public class SearchElementInRotatedArray {
    static int searchElement(int [] arr,int x){
        int low =0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[low]<arr[mid]){
                if(x>arr[low]&& x<arr[mid])
                    high=mid-1;
                else
                    low = mid+1;
            }
            else {
                if(x>arr[mid]&& x <=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,40,60,5,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to search");
        int x = sc.nextInt();
        System.out.println("index of the entered number : "+searchElement(arr,x));
    }
}
