class Base{
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}
class Derived extends Base{
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }
    public void result(int addResult,int subResult,int multiplyResult,int divideResult){
        System.out.println(addResult);
        System.out.println(subResult);
        System.out.println(multiplyResult);
        System.out.println(divideResult);
    }
}
public class Inheritence {
    //Here we will created object of derived class and use methods of base and derived class aswell
    public static void main(String[] args) {
    Derived calc = new Derived();
    int addResult = calc.add(10,20);
    int subResult = calc.sub(10,20);
    int multiplyResult = calc.multiply(10,20);
    int divideResult = calc.divide(10,20);
    calc.result(addResult,subResult,multiplyResult,divideResult);
    }
    
}
