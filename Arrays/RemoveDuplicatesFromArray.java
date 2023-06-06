package Arrays;

public class RemoveDuplicatesFromArray {
 /*   naive solution
    public static void revDup(int[] arr){
        int temp[] = new int[arr.length];
        temp[0]=arr[0];
        int res=1;
        for (int i = 1;i< arr.length;i++){
            if(arr[i]!=temp[res-1]){
                temp[res]=arr[i];
                res++;
            }
        }
        for (int j=0;j<temp.length;j++){
            arr[j]=temp[j];
        }
    }*/
    public static void revDup(int[] arr){
        int flag =1;
        for (int i=1;i< arr.length;i++){
            if (arr[i]!=arr[flag-1]) {
                flag++;
                arr[flag-1] = arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{12,12,13,13,13,13,14,14,};
        revDup(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
