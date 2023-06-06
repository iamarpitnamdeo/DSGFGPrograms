package Arrays;

public class SecondLargestElementInArray {
    /* Naive Approach
    static int getLargest(int[] arr){
     int max = 0;
     for (int i=1;i<arr.length;i++){
         if(arr[i]>arr[max]){
             max = i;
         }
     }
     return max;
    }
    static int getSecondLargest(int[] arr){
        int largest = getLargest(arr);
        int result = -1;
        for(int i =0 ;i< arr.length;i++){
            if(arr[i]!=arr[largest])
            {
                if(result==-1)
                    result = i;
                else if(arr[i]>arr[result])
                    result=i;
            }
        }
        return result;
    }
*/
/*optimal solution */

    static int getSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ;i < arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondLargest && arr[i]<largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12,2,15,20,21 ,3};
        System.out.println(getSecondLargest(arr));
    }
}
