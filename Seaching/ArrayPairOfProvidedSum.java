package Seaching;

public class ArrayPairOfProvidedSum {
    static int sumPair(int []arr, int n){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==n) {
                System.out.println(arr[i] + " " + arr[j]);
                return 0;
            }
            else if(arr[i]+arr[j]>n){
                j--;
            }else {
                i++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{2,4,8,9,11,12,20,30};
        sumPair(arr,99);
    }
}
