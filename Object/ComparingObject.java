class A{
    public String PrintA(){
        return "Inside A";
    }
}
class B extends A{
    public String PrintA(){
        return "Inside B";
    }
}
public class ComparingObject{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}