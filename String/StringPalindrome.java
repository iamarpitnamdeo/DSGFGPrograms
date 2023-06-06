package String;

public class StringPalindrome {
    /*naive solution
    static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }*/
    static boolean isPalindrome(String s){
        int begin =0;
        int end = s.length()-1;
        while(begin<end){
            if(s.charAt(begin)!=s.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ABCCBA";
        System.out.print(isPalindrome(str));
    }
}
