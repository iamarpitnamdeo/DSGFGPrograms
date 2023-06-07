package String;

public class AnagramSearch {
    static final int ch =256;
   /* static boolean stringAnagram(String s1,String s2,int i){
        int[] count = new int [ch];
        for(int j=0;j<s2.length();j++){
            count[s2.charAt(j)]++;
            count[s1.charAt(i+j)]--;
        }
        for(int k=0;k<ch;k++){
            if(count[k]!=0)
                return false;
        }
        return true;
    }
    static boolean strAnagramSearch(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        for(int i=0;i<n-m;i++){
            if(stringAnagram(s1,s2,i))
                return true;
        }
        return false;
    }*/
    static boolean areEqual(int [] ct, int [] pt){
        for (int i=0;i<ct.length;i++){
            if(ct[i]!=pt[i])
                return false;
        }
        return true;
    }
    static boolean strAnagramSearch(String text, String pattern){
        int [] CT = new int[ch];
        int [] PT = new int[ch];
        for (int i=0;i<pattern.length();i++){
            CT[text.charAt(i)]++;
            PT[pattern.charAt(i)]++;
        }
        for(int j=pattern.length();j<text.length();j++){
            if(areEqual(CT,PT)){
                return true;
            }
            CT[text.charAt(j)]++;
            CT[text.charAt(j-pattern.length())]--;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "frog";
        System.out.println(strAnagramSearch(s1,s2));
    }
}
