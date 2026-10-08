
class parent{
    public void PrintHello(){
        System.out.println("Hello World");
    }
}
class child extends parent{
    public void PrintHello(){
        System.out.println("Hello city");
    }
}

public class Overriding {
    public static void main(String[]args){
        child obj = new child();
        obj.PrintHello();
    }
}
