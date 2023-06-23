package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ChocoloateDistributionProblem {
    static int fairDistrubion(int [] arr,int m){
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = arr.length-1;i>=m ;i--){
            result = Integer.min(result,arr[i]-arr[i-(m-1)]);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{3,4,1,9,56,7,9,12};
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.print(fairDistrubion(arr,m));
    }
}
