

final class Teachers {
    public final void SayHello(){
        System.out.println("Hello Student");
    }
}
// class Student extends Teachers{
    // error
// }

public class FinalEx {

    public void SayHello(){
        System.out.println("Hello World");
    }
    final int age = 50;
    // int age = 18; error
    
    public static void main(String[] args) {
        FinalEx obj = new FinalEx();
        obj.SayHello();
    }
}
