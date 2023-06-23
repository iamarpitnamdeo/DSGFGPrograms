package Sorting;

import java.util.Scanner;

public class KthSmallestElementUsingLomutoPartition {
    static int lomutoPartition(int [] arr, int low, int high){
        int i = low-1;
        int p = arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<arr[high]){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]= temp;
        return i+1;
    }

    static int kthSmallestElementLomuto(int [] arr,int k){
        int low = 0;
        int high =arr.length-1;
        while (low<=high){
            int p = lomutoPartition(arr,low,high);
            if(p==k-1)
                return p;
            else if (p>k-1) {
                high=p-1;
            }else {
               low =p+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= new int[]{7,5,2,4,9,8,3,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k ");
        int k = sc.nextInt();
        int result =kthSmallestElementLomuto(arr,k);
        System.out.println("Kth smallest element of the provided array is "+arr[result]);
    }
}
