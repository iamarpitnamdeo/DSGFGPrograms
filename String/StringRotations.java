package String;

public class StringRotations {
    static boolean areRotationStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(areRotationStrings(s1, s2));
    }
}