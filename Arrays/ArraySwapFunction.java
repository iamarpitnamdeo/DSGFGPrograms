package Arrays;

public class ArraySwapFunction {
    static void swap(int [] arr,int a, int b){
        int temp = arr[a];
         arr[a]= arr[b];
         arr[b]= temp;
    }

    public static void main(String[] args) {
        int [] arr = new int []{1,2,3,4,5,6};
        int i=2;int j= 5;
        swap(arr, i, j);
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}
