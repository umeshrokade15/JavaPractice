class paramConstructor{
        public paramConstructor(int a , int b){
            System.out.println(a+b);
        }
    }
public class constructor {
        //same name as class name 
        // no return type 
        //called when onj is created
        //automatically created when object is created
        //public constructor{
        //default constructor
        //}
    public constructor(){
        System.out.println("inside constructor");
    }
    
    public static void main(String[]args){
        constructor log = new constructor();
        paramConstructor add = new paramConstructor(10,20);
    }    
}
