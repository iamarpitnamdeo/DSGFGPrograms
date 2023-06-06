package Arrays;

public class MoveZeroesToEnd {
    static void move0end(int[]arr){
        int count =0;{
            for (int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    int temp = arr[i];
                    arr[i] = arr[count];
                    arr[count]=temp;
                    count++;
                }
            }
        }
    }
    /*naive approach
    static void move0end(int[] arr){

        for (int i = 0 ;i < arr.length ; i++){
            if(arr[i]==0){
                for (int j =i+1 ;j<arr.length;j++){
                    if(arr[j]!=0)
                    {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
    }*/
    public static void main(String[] args) {
        int [] arr = new int[]{8,5,0,10,0,20};
        move0end(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
