package Sorting;

import java.util.Arrays;

public class MinimumDifferenceInTheArray {
    /*static int lomutoPartition(int [] arr, int l, int h){
        int i = l-1;
        int p = arr[h];
        for(int j = l;j<h;j++){
            if(arr[j]<p){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h]=temp;
        return i+1;
    }
    static int quickSort(int []arr,int l,int h){
        if(l<h){
            int p = lomutoPartition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
        return (arr[1]-arr[0]);
    }*/
    static int minDiffApproach1(int [] arr){
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i< arr.length-1;i++){
            result = Integer.min(result,Math.abs(arr[i]-arr[i+1]));
        }
        return result;
    }
    static int mindiffNaive(int [] arr){
        int result = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                result = Integer.min(result,Math.abs(arr[i]-arr[j]));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,8,12,5,18};
        System.out.println(mindiffNaive(arr));
        System.out.println(minDiffApproach1(arr));

    }
}
