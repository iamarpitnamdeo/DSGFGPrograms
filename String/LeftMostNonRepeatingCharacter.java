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

    public static class StringRotations {
       /* static String leftRotateByOne(String s){
            char [] temp = s.toCharArray();
            char temp1 = temp[0];
            for(int i=1;i<temp.length;i++){
                temp[i-1]=temp[i];
            }
            temp[temp.length-1]=temp1;
            String s2 = new String(temp);
            return s2;
        }

        static boolean areRotationStrings(String s1,String s2){
                for(int i=0;i<s1.length();i++){
                    if(s1.equals(s2))
                        return true;
                    else
                        s1=leftRotateByOne(s1);
                }
                return false;
        }*/
        static boolean areRotationStrings(String s1,String s2){
            if(s1.length()!=s2.length()) {
                return false;
            }
            return (s1+s1).contains(s2);
        }

        public static void main(String [] arg){
            String s1 = "ABCD";
            String s2 = "CDAB";
            System.out.println(areRotationStrings(s1,s2));
        }
    }
}
