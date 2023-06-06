package Arrays;

public class DecLareArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<5;i++){
            arr[i]=i;
        }
        System.out.println(arr.length);
        for (int i = 0 ;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
/*Insertion at arry O(n)
  Searching element in arry O(n) | O(1) for sorted array
  Deleting an element O(n)
*
* */