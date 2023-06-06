package Arrays;
public class LeftRotateArrayByDTimes {

    static void reverse(int[] arr, int low, int high) {
        while (low<high){
            int temp = arr[low];
            arr[low] =arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    static void leftRotateByDApproach2(int[] arr, int d) {
            reverse(arr,0,d-1);
            reverse(arr,d,arr.length-1);
            reverse(arr,0,arr.length-1);
    }

    static void leftRotateBy1(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    static void leftRotateByD(int[] arr, int d) {
        for (int i = 0; i < d; i++)
            leftRotateBy1(arr);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        //leftRotateByD(arr, 4);
        leftRotateByDApproach2(arr,3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}