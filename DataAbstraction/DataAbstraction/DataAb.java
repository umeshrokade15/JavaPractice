package DataAbstraction;
class hidden{
    int Height = 175;
    private int phoneno = 95525999; // only available in same class
    protected int age = 21;
    public int givePhoneno(){ //available everywhere
        return phoneno;
}
}

public class DataAb{
    
    protected int fullName = 15;
    public static void main(String[]args){
        hidden obj = new hidden();
        int printPhone = obj.givePhoneno();
        System.out.println(printPhone);
        System.out.println(obj.Height);
        System.out.println(obj.age);
        
    }
}
