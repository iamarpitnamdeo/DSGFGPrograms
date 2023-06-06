package String;


public class LeftMostNonRepeatingCharacter {
   static final char CHAR = 256;
   /* naive method
   static int firstNonRep(String s1){
        for(int i =0 ; i <s1.length();i++){
            boolean flag = false;
            for(int j =0 ; j<s1.length();j++){
                if(i!=j && s1.charAt(i)==s1.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if(flag==false)
                return i;
        }
        return -1;
    }*/
    //second approach
    /*static int firstNonRep(String s1){
        int [] count = new int[CHAR];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(count[s1.charAt(i)]==1)
                return i;
        }
        return -1;
    }*/
    //third approach
    static int firstNonRep(String s1){
        return 0;
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        System.out.println("Index of firs non repeting character is "+firstNonRep(s1));
    }
}
