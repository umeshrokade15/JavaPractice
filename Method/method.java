class hello{
    public void printit(String name){
        System.out.println("hello "+ name);
        
    }
}
public class method{
    public static void main(String[]args){
        hello hel = new hello();
        hel.printit("Umesh");
    }
}
