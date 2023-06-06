package String;

public class LeftmostRepeatingCharacter {
    //Naive approach
   /* static int leftRepeat(String str){
        for (int i=0 ;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i+1))
                return i;
        }
        return -1;
    }*/
    //better approach2
    static final int CHAR = 256;
    static int leftRepeat(String str){
        boolean [] visited = new boolean[CHAR];
        int res = -1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)])
                res=i;
            else
                visited[str.charAt(i)]=true;
        }
        return res;
    }
    public static void main(String[] args) {
        String s1 = "abeccdffg";
        System.out.println("Index of the leftmost reapating character is "+leftRepeat(s1));
    }
}
