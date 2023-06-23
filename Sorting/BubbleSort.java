package Sorting;

public class BubbleSort {
    static void bubbleSortnaive(int [] a1){
        int i=0;int j=0;
        for (i=0;i<a1.length-1;i++){
            for (j=0;j<a1.length-1;j++){
                if(a1[j]>a1[j+1]){
                    int temp = a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=temp;
                }
            }
            System.out.println("i : "+ i +" j : "+j);
        }
    }
    static void bubbleSortaproach2(int [] a2){
        int i = 0; int j=0;
                for(i =0 ;i<a2.length-1;i++){
                    for(j =0 ;j<a2.length-i-1;j++){
                        if(a2[j]>a2[j+1]){
                            int temp = a2[j];
                            a2[j]=a2[j+1];
                            a2[j+1]=temp;
                        }
                    }
                    System.out.println("i : "+ i +" j : "+j);
                }
    }
    static void bubbleSortOptimized(int []a3){
        boolean swapped;
        int j;
        for(int i =0 ;i<a3.length-1;i++){
            swapped = false;
            for (j=0;j<a3.length-i-1;j++){
                if(a3[j]>a3[j+1]){
                    int temp = a3[j];
                    a3[j]=a3[j+1];
                    a3[j+1]=temp;
                    swapped =true;
                }
            }
            System.out.println("i : "+ i +" j : "+j);
            if (swapped == false)
                break;
        }
    }


    public static void main(String[] args) {
        int [] arr = new int[]{8,6,2,3,9,5,7};
        //bubbleSortnaive(arr);
        //bubbleSortaproach2(arr);
        bubbleSortOptimized(arr);
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
