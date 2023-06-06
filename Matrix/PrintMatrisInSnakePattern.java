package Matrix;
//Time complexity of this solutin is Theta of R*C
public class PrintMatrisInSnakePattern {
    static void matrixInSnakePattern(int [][]arr){
        for (int i=0;i<arr.length;i++){
            if(i%2==0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int k = arr[i].length-1;k>=0;k--)
                {
                    System.out.print(arr[i][k]+" ");
                }
            }
        }

    }
    public static void main(String[] args) {
        int insertValue=0;
        int arr[][] = new int[4][3];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=insertValue;
                insertValue++;
            }
        }
        for (int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
           // System.out.print("\n");
        }
        System.out.print("\n");
        matrixInSnakePattern(arr);

    }
}
