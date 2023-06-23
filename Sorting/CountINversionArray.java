package Sorting;

public class CountINversionArray {
    static int mergeSortAndCount(int arr[],int l, int r){
        int result=0;
        if(l<r){
            int mid = (l+r)/2;
            result+=mergeSortAndCount(arr,1,mid);
            result+=mergeSortAndCount(arr,mid+1,r);
            result+=mergeAndCont(arr,l,mid,r);
        }
        return result;
    }
    static int mergeAndCont(int []arr,int l, int mid, int r){
        int [] left=new int[mid-l+1];
        int [] right= new int [r-mid];
        for(int i=0;i< left.length;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j< right.length;j++){
            right[j]=arr[mid+1+j];
        }
        int i=0;int j=0;int k=l;int result=0;
        while (i< left.length &&j< right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }else {
                arr[k]=right[j];
                j++;
                result+=(mid-l+1)-i;
            }
            k++;
        }
        while(i< left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j< right.length){
            arr[k]=right[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,11,8,2,3,13,6,9};
        System.out.println(mergeSortAndCount(arr,0,arr.length-1));
    }
}
