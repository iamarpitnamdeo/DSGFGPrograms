package Arrays;

public class CheckArraySortedOrNot {
    static String isArraySorted(int[] arr){
        int flag=0;
        for (int i = 0 ;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return "Un-Sorted";
            }
        }

            return "Sorted";
    }
    public static void main(String[] args) {
        int[] arr = new int[]{12,13,25,26,56,72,3};
        System.out.println(isArraySorted(arr));
    }

}
