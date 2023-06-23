package Java8;
interface MyInteface3{
    public String concat(String s1, String s2);
}
public class LambdaExpressionExample3 {
    public static void main(String [] args){
        MyInteface3 mf3 = (s1,s2)->{return s1+s2;};
        System.out.println(mf3.concat("Arpit ","Namdeo"));
    }
}
