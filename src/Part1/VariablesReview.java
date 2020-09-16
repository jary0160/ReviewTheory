
package Part1;

public class VariablesReview {


    public static void main(String[] args) {
        //primitive data types 
        int a = 1234567890; //4 bytes
        long d = 123456789123456789L; //8 bytes
        short c = 12345; //2 bytes
        byte b = 123; //1 byte
        
        //decimal 
        double dbl = 45.78; //8
        floatflt = 45.75F; //4
        
        //2 others
        char chr = 'x';
        boolean bool = true; //or false
        
        //Strings - > NOT primitive
        String s = "I went to school today";
        //String is capital(like all objects)
        //"s" has abilities (a.k.a methods)
                
        int len = s.length();
        char lett = s.charAt(7);
        String str1 = s.substring(3,8);
        String str2 = s.substring(4);
        //note on all methods
        //1 - all methods have a return type (send back something), except 
        //2 - methods may or may NOT require parameters - data sent in 
        //3 - some methods have more than one verision
               
    }
    
}
