
package Part1;

/**
 *
 * @author jary0160
 */
public class BedmasandCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 22;
        int y = x * 2;
        double z = y/7; //must cast y to double
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
        System.out.println("z is: " + z);
        
        //mod -> % = remainder of a calculation
        //44 /7, remainder of a calculation
        //44 /7, remainder =2
        int leftover = 44 % 7;
        System.out.format("I have %d candy left over\n", leftover);
        
        //BEDMAS
        System.out.println("\n\nBEDMAS\n=====\n\n'");
        int e, f, g;
        e=f=g=5; // assign all to the same thing at once
        int ans;
        
        ans = e + f * g; //30
        System.out.println("ans should be 30 ->" + ans);
        
        ans = e + f % g; //5 + 5 % 5 -> 5 + 0 = 5
        System.out.println("ans should be 5 -> " + ans);
        
        
        
        
        
    }
    
}
