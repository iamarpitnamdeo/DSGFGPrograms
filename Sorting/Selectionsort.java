package Sorting;

public class Selectionsort {
    static void selectionSortNaive2(int [] a2){
        for(int i=0;i<a2.length;i++){
            int minIndex = i;
            for(int j=i+1;j<a2.length;j++){
                if(a2[j]<a2[minIndex]){
                    minIndex=j;
                }
            }
            int temp = a2[i];
            a2[i] = a2[minIndex];
            a2[minIndex]=temp;
        }
    }
    static void selectionSortNaive1(int [] a1){
        int min;
        int add = 0;
        for(int i=0;i<a1.length;i++){
            min = a1[i];
            for(int j=i+1;j<a1.length;j++){
                if(a1[j]<min){
                    min = a1[j];
                    add=j;
                }
            }
            int temp = a1[i];
            a1[i]=min;
            a1[add]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{10,5,8,20,18};
        selectionSortNaive2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" -> "+arr[i]);
        }
    }
}
