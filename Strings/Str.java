public class Str{
    public static void main(String [] args){
        //String is a Class
        //String Using literal
        String name = "Umesh"; //here name reference is storing umesh
        System.out.println(name);
        //String are immutable
        name = name + "Rokade";//here we removed name reference from umesh and used it for umesh rokade which made umesh without a reference (elegible for garbage collector)
        System.out.println(name);
        //string has many methods
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.toUpperCase());

        //String Using new
        String fullName = new String("Don");
        System.out.println(fullName);

        //String buffer------------------------------------------------------------------------------
        //String buffer is a class that provide us mutable string 

        StringBuffer Sirname = new StringBuffer("Rokade");
        System.out.println(Sirname);
        //it has various method to make changes in string
        System.out.println(Sirname.append("Umesh"));
        // System.out.println(Sirname.insert(1 "Rajkumar"));
    
    }
}