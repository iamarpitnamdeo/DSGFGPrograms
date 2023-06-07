package String;

public class ReverseWordsInAString {
    static void reverse(char [] temp,int low,int high){
        while(low<=high){
            char temp1 = temp[low];
            temp[low]=temp[high];
            temp[high]=temp1;
            low++;
            high--;
        }
    }

    static String reverseWords(String str){
        char [] temp = str.toCharArray();
        int start =0;
        for(int end=0;end<temp.length;end++){
            if(temp[end]==' '){
                reverse(temp,start,end-1);
                start =end+1;
            }
        }
        reverse(temp,start,temp.length-1);
        reverse(temp,0,temp.length-1);
        String st = new String(temp);
       return st;
    }
    public static void main(String[] args) {
        String str = "Welcome to Gfg";
        System.out.println("Initial String "+str);
       System.out.println("String after words reversed "+reverseWords(str));
        }

    public static class PatternSearching {
        static void patternSearchOptimizeNaiveApproach(String text,String pattern){
            //note all characters of patterns should be unique in this approach
            int n = text.length();
            int m = pattern.length();
            for(int i=0;i<=n-m;){
                int j=0;
                for( j=0;j<m;j++){
                    if(pattern.charAt(j)!=text.charAt(i+j)) {
                        break;
                    }
                    if(j==m-1) {
                        System.out.println(i + " ");
                    }
                }
                if(j==0){
                    i++;
                }
                else {
                    i=i+j;
                }
            }
        }

        static void patternSearchNaiveSolution(String text,String pattern){
            int n = text.length();
            int m = pattern.length();
            for(int i=0;i<=n-m;i++){
                for(int j=0;j<m;j++){
                    if(pattern.charAt(j)!=text.charAt(i+j))
                        break;
                    if(j==m-1){
                        System.out.println(i+" ");
                    }
                }
            }
        }

        public static void main(String[] args) {
            String text = "ABCEABEDABCD";
            String pattern = "ABCD";
            patternSearchNaiveSolution(text,pattern);
            patternSearchOptimizeNaiveApproach(text,pattern);
        }
    }
}
