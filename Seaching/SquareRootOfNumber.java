package Seaching;
import java.util.Scanner;
public class SquareRootOfNumber {
    /* naive solution
    static int sqrt(int x){
       int i=1;
       while (i*i<=x){
          i++;
       }
       return i-1;
    }*/
    //Binary search optimised approach
    static int sqrt(int x){
        int low =0; int high = x; int ans = -1;
        while (low<=high){
            int mid=(low+high)/2;
            if(mid*mid == x){
                return mid;
            }else if(mid*mid >x){
                high= mid-1;
            }else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number");
       int x = scan.nextInt();
       System.out.println("Square root of the entered number is"+sqrt(x));
    }
}
