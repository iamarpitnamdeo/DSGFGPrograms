package Matrix;
import java.util.Scanner;
public class BoundryTraversalOfMatrix {
    static void printBoundryTraversal(int [][]  arr,int rows,int columns){
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                if(i==0||i==rows-1||j==columns-1||j==0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of cloumns");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the elements of the metrix");
        for(int i=0 ; i <rows; i++){
            for( int j=0; j < columns ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i =0;i<arr.length;i++){
            for( int j =0 ;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        printBoundryTraversal(arr,rows,columns);
    }
}
