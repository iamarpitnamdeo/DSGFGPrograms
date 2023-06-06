package Seaching;

public class RepeatingElement {
    /*static int arrRepeat(int [] arr){
        int [] temp = new int[arr.length-1];
        for (int i=0;i<arr.length;i++){
            temp[arr[i]]++;
            if(temp[i]>1) {
                return i;
            }
        }
        for (int i=0;i<temp.length;i++){
            if(temp[i]>1) {
                return i;
            }
        }
        return -1;
    }*/
    //approach 2
    static int arrRepeat(int[] arr){
        boolean [] temp = new boolean[arr.length-1];
        for (int i = 0 ; i < arr.length ; i++){
            if(temp[arr[i]]){
                return arr[i];
            }
            temp[arr[i]]=true;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,0,3,4,5};
        System.out.println("The repeating element of the array is"+arrRepeat(arr));
    }
}
