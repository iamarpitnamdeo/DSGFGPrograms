package Arrays;
//java function to find the position of largest element in the array and element
// time complexity O(n)
public class LargestElementInArray {
    int largestElement(int array[]){
        int max =array[0];
        int res =0;
        for(int i = 1; i<array.length;i++){
            if (array[i]>max){
                max = array[i];
                res =i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10,13,23,77,8,9,24};
        LargestElementInArray obj = new LargestElementInArray();
        System.out.println(obj.largestElement(arr));
    }
}
