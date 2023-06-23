package Java8;

interface MyFunctionalInterface1{
    public String sayHello();
}

public class LambdaExpressionExample1 {
    public static void main(String args[]){
        MyFunctionalInterface1 msg = () ->  {return "hello";};
        System.out.println(msg.sayHello());
    }

}
