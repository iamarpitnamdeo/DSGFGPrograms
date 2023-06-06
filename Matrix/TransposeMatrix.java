package Matrix;
import java.util.Scanner;
public class TransposeMatrix {
    /*naive solution
    static void transposeMatrix(int[][] arr , int row, int column){
        int temp [][] = new int [row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                temp[i][j]=arr[j][i];
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
             arr[i][j]=temp[i][j];
            }
        }
    }*/
    static void transposeMatrix(int [][] arr,int row, int column){
        for (int i=0;i<row;i++){
            for(int j=i+1;j<column;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int [row][column];
        for(int i=0;i< row;i++){
            for (int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transposeMatrix(arr,row,column);
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
