package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElementInTheArray {
    static int kthSmallestElementNaive(int [] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr= new int[]{7,5,2,4,9,8,3,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k ");
        int k = sc.nextInt();
        System.out.println("Kth smallest element of the provided array is "+kthSmallestElementNaive(arr,k));
    }
}
