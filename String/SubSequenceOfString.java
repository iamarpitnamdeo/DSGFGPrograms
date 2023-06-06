package String;

public class SubSequenceOfString {
    /*
    iterative approach
    static boolean isSubString(String s1, String s2){
        int j=0;int i=0;
            while(i<s1.length()&&j<s2.length()){
                if(s2.charAt(j)==s1.charAt(i)){
                    j++;
                    i++;
                }else {
                    i++;
                }
            }
            if(j==s2.length()){
                return true;
            }
            return false;
    }*/
    //recursive approach - although iterative is better
    static boolean isSubString(String s1, String s2,int n, int m ){
        if(m==0)
            return true;
        if(n==0)
            return false;
        if(s1.charAt(n-1)==s2.charAt(m-1))
            return isSubString(s1,s2,n-1,m-1);
        else
            return isSubString(s1,s2,n-1,m);
    }
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "grges";
        System.out.println(isSubString(s1,s2,s1.length(),s2.length()));
    }
}
