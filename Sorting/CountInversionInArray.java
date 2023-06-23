package Sorting;

public class CountInversionInArray {
    static int countInversions(int [] arr){
        int result =0;
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{2,4,1,3,5};
        System.out.println(countInversions(arr));
    }
}
