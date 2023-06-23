package Java8;
interface MyInterface4{
    void display();
}
public class MethodReferenceExample1 {

    public void myMethod(){
        System.out.println("Instance method of an object");
    }
    public static void Main(String [] args){
        MethodReferenceExample1 mr = new MethodReferenceExample1();
        MyInterface4 ref = mr::myMethod;
        ref.display();
    }

}
