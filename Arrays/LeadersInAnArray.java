package Arrays;

public class LeadersInAnArray {
    static void leaders(int [] arr){
        int currentLeader = arr[arr.length-1];
        System.out.println(currentLeader);
        for(int i =arr.length-2;i>=0;i--){
            if(currentLeader<arr[i]){
                currentLeader = arr[i];
                System.out.println(currentLeader);
            }
        }

    }

    static void leadersOfArray(int [] arr){
        for(int i =0 ;i <arr.length;i++){
            boolean flag = false;
            for( int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int []arr = new int[]{7,10,4,10,6,5,2};
        leaders(arr);
    }
}
