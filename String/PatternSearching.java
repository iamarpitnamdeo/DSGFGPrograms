package String;

public class PatternSearching {
    static void patternSearchNaiveSolution(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                if (pattern.charAt(j) != text.charAt(i + j))
                    break;
                if (j == m - 1) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "AAAAAA";
        String pattern = "AAA";
        patternSearchNaiveSolution(text, pattern);
    }
}
