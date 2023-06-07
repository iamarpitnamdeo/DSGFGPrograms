package Seaching;

public class LongestProperPrefixWhichIsAlsoSuffix {
    static int longPropPreSuffix(String str, int n){
        for(int len= n-1;len>0;len--){
            boolean flag = true;
            for(int i=0;i<len;i++){
                if(str.charAt(i)!=str.charAt(n-len+i)) {
                    flag = false;
                    break;
                }
                if(flag == true)
                    return len;
            }
        }
        return 0;
    }

    static void fillLPS(String str, int [] lps){
        for(int i=0;i<str.length();i++)
            lps[i]=longPropPreSuffix(str,i+1);
    }

    public static void main(String[] args) {
        String s1 = "ababacab";
        int []lps = new int[s1.length()];
        fillLPS(s1,lps);
        for(int i=0;i<lps.length;i++){
            System.out.println(lps[i]);
        }
    }
}
