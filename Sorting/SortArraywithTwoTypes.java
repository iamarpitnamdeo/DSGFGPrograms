package Sorting;

public class SortArraywithTwoTypes {
    static void swap(int [] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void segregatePosNegHoversPartition(int [] arr){
        int i = -1;
        int j = arr.length;
        do{
            i++;
        }while (arr[i]<0);
        do{
            j--;
        }while (arr[j]>0);
        if(i<j){
            swap(arr,i,j);
        }
    }

    static void segregatePosNeg(int [] arr){
        int i=0;
        int []temp = new int[arr.length];
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                temp[i++]=arr[j];
            }
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]>0){
                temp[i++]=arr[k];
            }
        }
        for(int l=0;l<temp.length;l++){
            arr[l]=temp[l];
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{-12,-12,4,-9,5,8,1,-15,-14};
        segregatePosNeg(arr);
        for (int j :arr){
            System.out.print(j+" ");
        }
        System.out.println();
        segregatePosNegHoversPartition(arr);
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
}
