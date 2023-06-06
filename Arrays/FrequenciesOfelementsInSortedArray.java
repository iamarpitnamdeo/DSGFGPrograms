package Arrays;

public class FrequenciesOfelementsInSortedArray {
    /*static void frequencyCounts(int [] arr){
        int frequency =1;int i=1;
        while (i<arr.length){
            while (i<arr.length&&arr[i]==arr[i-1]){
                frequency++;
                i++;
            }
            System.out.println(arr[i]+" "+frequency);
            i++;
            frequency=1;
        }
        if(arr.length==1||arr[arr.length-1]!=arr[arr.length-2]){
            System.out.println(arr[arr.length-1]+" "+1);
        }
    }*/
    static void frequencyCounts(int [] arr){
        int count=1;
        for(int i =0 ;i<arr.length;i++){
            if(i< arr.length-1 && arr[i+1]==arr[i]){
                count++;
            }else {
                System.out.println(arr[i] + " " + count);
                count = 1;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,10,10,25,30,30};
        frequencyCounts(arr);
    }
}
