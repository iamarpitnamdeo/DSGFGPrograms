package Seaching;

public class TripletsInTheSortedArray {
    static int tripletSum(int [] arr,int n){
        for(int i=0;i<arr.length-2;i++){
            int tempsum=n-arr[i];
            int j=i+1;
            int k=arr.length-1;
            while (j<k){
                if(arr[j]+arr[k]==tempsum){
                    System.out.println(arr[i]+" "+arr[j] + " " + arr[k]);
                    return 0;
                } else if (arr[j]+arr[k]>tempsum) {
                    k--;
                }else {
                    j++;
                }
            }
        }
        System.out.println("no triplets available for the given sum");
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,8,9,20,40};
        tripletSum(arr,33);
    }
}
