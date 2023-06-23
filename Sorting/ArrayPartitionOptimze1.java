package Sorting;
//lomuto partition algorithm
public class ArrayPartitionOptimze1 {
    static void pivotPartition(int []arr){
        int i=0;
        int pivot = arr[2];
        for(int j=0;j<arr.length;j++){
            if(arr[j]<=pivot){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }
    static void lomutoPartition(int [] arr){
        int l = 0;
        int h = arr.length - 1;
        int i= l-1;
        int pivot = arr[h];
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        System.out.println("pivot position"+(i+1));
    }
    public static void main(String[] args) {
            int arr[] = new int[]{10,80,30,90,40,50,70};
        pivotPartition(arr);

            for(int i =0 ;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
}
