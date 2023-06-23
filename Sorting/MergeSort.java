package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
public class MergeSort {
    static void mergeSort2(int []a1,int []a2){
        int m=a1.length;
        int n=a2.length;
        int i=0;int j=0;
        while (i<m&&j<n){
            if(a1[i]<=a2[j]){
                System.out.print(a1[i]+" ");
                i++;
            }else {
                System.out.print(a2[j] + " ");
                j++;
            }
        }
        while (i<m){
            System.out.print(a1[i]+" ");
            i++;
        }
        while (j<n){
            System.out.print(a2[j]+" ");
            j++;
        }
    }
    static void mergeSort1(int [] a1, int [] a2){
        int m = a1.length;
        int n = a2.length;
        int[] arr = new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=a1[i];
        }
        for(int j=0;j<n;j++){
            arr[j+m]=a2[j];
        }
        Arrays.sort(arr);
        for(int k =0 ; k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{10,15,20,20};
        int[] arr2 = new int[]{1,2};
        mergeSort2(arr1,arr2);
    }
}
