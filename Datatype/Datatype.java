class Data{
    public static void main (String []args){
        byte age = 20; // 1 Byte || -128 --- 127 || -2^-7 --- 2^7 -1
        short num = 2020; // 2 Byte || -32768 --- 32767 || -2^-15 --- 2^15 -1
        int mob = 1552591063; // 4 Byte || -2147483648 --- 2147483647 || -2^-31 --- 2^31 -1
        long population = 800000000000l; // 8 Byte || Just Search || -2^-63 --- 2^63 -1
        float pi = 3.14f;  // 4 Byte || Single Presition
        double pip = 3.1499229222;  // 4 Byte || more Presition
        char g = 'g'; // 2Byte || stores single unicode character
        boolean male = true; // 1Byte || true or false

        //Storing Binary and Hexadecimal

        int bi = 0b101;
        int hex = 0x7e;

        //Conversions - convering from one data type to another there are two types

        // implict conversion - Implicit conversion happens automatically by
        // Java when converting a smaller compatible data type into a larger data type.
        int a = 10;
        double b = a;

        //Explict conversions - Explicit conversion is when the programmer 
        // manually converts one data type into another using a cast operator.

        double price = 99.99;
        int x = (int) price; //Casting------

        // if the value we are storing is bigger than the type of storing variable than it's modulo will be stored

        int c = 500;
        byte d = (byte)c; //its modulo will be stored
        
        System.out.print(b);
    }
}