package Arrays;

public class MaximumDifference {
    //best complexity
    static int maxDifferenceApproach2(int [] arr){
        int result = arr[1]-arr[0];
        int minValue = arr[0];
        for(int i = 1;i< arr.length;i++){
            result = Integer.max(result,arr[i]-minValue);
            minValue = Integer.min(minValue,arr[i]);
        }
        return result;
    }
    // naive solution
    static int maxDiffApproach1(int [] arr){
        int result = arr[1]-arr[0];
        for (int i=0;i<arr.length-1;i++){
            for(int j =i+1 ;j<arr.length;j++){
                result=Integer.max(arr[j]-arr[i],result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{2,3,10,6,4,8,1};
        System.out.println("Maximum difference is "+maxDifferenceApproach2(arr));
    }
}
