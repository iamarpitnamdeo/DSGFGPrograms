package Seaching;

public class MedianOfTwoSortedArrays {
    static double arraysMedian(int [] arr1,int [] arr2){
        int n1 = arr1.length; int n2 = arr2.length;
        int begin1 = 0; int end1=n1;
        while (begin1<=end1){
            int i1 = (begin1+end1)/2;
            int i2 = ((n1+n2+1)/2)-i1;
            //min1 = beginning of the right sidea1
            //max1 = end of the left side a1
            //min2 = beginning of the right side of a2
            //max2 = end of the left side of a2
            int min1 = (i1==n1)?Integer.MAX_VALUE:arr1[i1];
            int max1 = (i1==0)?Integer.MIN_VALUE:arr1[i1-1];
            int min2 = (i2==n2)?Integer.MAX_VALUE:arr2[i2];
            int max2 = (i2==0)?Integer.MIN_VALUE:arr2[i2-1];

            if(max1<min2 && max2<min1){
                if((n1+n2)%2==0){
                    return  ((double)Math.max(min1,min2)+Math.max(max1,max2)/2);
                }
                else{
                    return ((double)Math.max(max1,max2));
                }
            }
            else if(max1>min2){
                    end1=i1-1;
            }else {
                    begin1=i1+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr1 = new int[]{30,40,50,60};
        int [] arr2 = new int[]{5,6,7,8,9};
        System.out.println("Median of the provided two soreted arrays is "+arraysMedian(arr1,arr2));
    }
}
