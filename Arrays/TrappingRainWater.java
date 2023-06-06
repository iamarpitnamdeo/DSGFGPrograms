package Arrays;

import com.sun.source.tree.BreakTree;

public class TrappingRainWater {
    static int trapRainWater2(int[] arr) {
        int n = arr.length;
        if (n <= 2) {
            return 0; // No water can be trapped with less than 3 elements
        }

        int[] leftMax = new int[n];  // Array to store the maximum heights on the left side
        int[] rightMax = new int[n]; // Array to store the maximum heights on the right side

        leftMax[0] = arr[0];
        rightMax[n - 1] = arr[n - 1];

        // Pre-compute the maximum heights on the left side of each element
        for (int i = 1; i < n; i++) {
            leftMax[i] = Integer.max(leftMax[i - 1], arr[i]);
        }

        // Pre-compute the maximum heights on the right side of each element
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Integer.max(rightMax[i + 1], arr[i]);
        }

        int result = 0;

        // Calculate the trapped water for each element
        for (int i = 1; i < n - 1; i++) {
            int minHeight = Integer.min(leftMax[i], rightMax[i]);
            if (minHeight > arr[i]) {
                result += minHeight - arr[i];
            }
        }

        return result;
    }


    static int trapRainWater(int []arr){
        int result =0;
        for(int i=1;i< arr.length-1;i++){
            int lmax = arr[i];
            for(int j=0;j<i;j++){
                lmax = Integer.max(lmax,arr[j]);
            }
            int rmax = arr[i];
            for(int k=i+1;k< arr.length;k++){
                rmax = Integer.max(rmax,arr[k]);
            }
            result =result+((Integer.min(lmax,rmax))-arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,0,1,2,5};
        System.out.println(trapRainWater2(arr));
    }
}
