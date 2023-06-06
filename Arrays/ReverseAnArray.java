package Arrays;

public class ReverseAnArray {
    public static void reverse(int[] arr){
        int low =0;
        int high = arr.length-1;
        while (low<high){
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,23,32,11,57,62};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        reverse(arr);
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
