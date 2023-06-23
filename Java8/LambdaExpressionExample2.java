package Java8;

interface Myinterface2{
    public int incrementByFive(int n);
}
public class LambdaExpressionExample2 {
    public static void main(String args[]){
        Myinterface2 my = (n) ->{ return n+5;};
        System.out.println(my.incrementByFive(10));
    }
}
