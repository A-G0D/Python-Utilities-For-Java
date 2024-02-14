//imports
import static java.lang.System.*;
import java.io.*;
import java.util.*;

//start of class (must inherit)
public class Utilities {
    
    //https://docs.python.org/3/library/functions.html
    
    //A
    
        /* abs(x)
         * Return the absolute value of a number. The argument may be an integer, 
         * a floating point number, or an object implementing __abs__(). If the 
         * argument is a complex number, its magnitude is returned.
         */
         
            //int variant
            public static int abs(int x) {
                return Math.abs(x);
            }
            
            //float variant
            public static double abs(double x) {
                return Math.abs(x);
            }
            
        /* all(iterable)
         * Return True if all elements of the iterable are true (or if the iterable 
         * is empty). Equivalent to:
         */
         
            //iterable variant
            public static boolean all(Collection x) {
                if (x.isEmpty()) return true;
                if ((new HashSet<Boolean>(x)).size() == 1) return true;
                return false;
            }
        
        /* any(iterable)
         * Return True if any element of the iterable is true. If the iterable is empty, return False. Equivalent to:
         */
         
            //iterable variant
            public static boolean any(Collection x) {
                if (x.isEmpty()) return false;
                for (var i : x) if (i != null) return true;
                return false;
            }
            
        /* bin(x)
         * Convert an integer number to a binary string prefixed with “0b”. The 
         * result is a valid Python expression.
         */
        
            //int variant
            public static String bin(int x) {
                String s = "0b";
                if (x < 0) s = "-" + s;
                x = abs(x);
                s += Integer.toBinaryString(x);
                return s;
            }
}
