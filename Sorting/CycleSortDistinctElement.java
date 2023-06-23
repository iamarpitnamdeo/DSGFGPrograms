package Sorting;

public class CycleSortDistinctElement {
    static void cycleSortDiscinc(int [] arr){
        for(int i=0;i< arr.length-1;i++){
            int item = arr[i];
            int pos= i;
            for(int j = i+1 ;j<arr.length;j++){
                if(arr[j]<item)
                    pos++;
            }
            int temp = arr[pos];
            arr[pos] =item;
            item =temp;

            while (pos!=i){
                pos= i;
                for(int j=i+1;j<arr.length;j++) {
                    if (arr[j] < item) {
                        pos++;
                    }
                }
                    int temp1 = arr[pos];
                    arr[pos] =item;
                    item =temp1;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = new int [] {20,40,50,10,30};
        cycleSortDiscinc(arr);
        for(int j : arr){
            System.out.print(j+" ");
        }
    }
}
