//imports
import static java.lang.System.*;
import java.io.*;
import java.nio.*;
import java.util.*;

//start of class (must inherit)
public class Utilities {
    public static final boolean True = true;
    public static final boolean False = false;
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
    
    //B
    
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
            
        /* bool(x)
         * Return a Boolean value, i.e. one of True or False. x is converted using 
         * the standard truth testing procedure. If x is false or omitted, this 
         * returns False; otherwise, it returns True. The bool class is a subclass 
         * of int (see Numeric Types — int, float, complex). It cannot be subclassed 
         * further. Its only instances are False and True (see Boolean Type - bool).
         */
        
            //object variant (universal, nonspecific)
            public static boolean bool(Object x) {
                if (o == null) return false;
                if (o instanceof boolean && o == false) return false;
                if (o instanceof Number && o == 0) return false;
                if (o instanceof Collection && o.isEmpty()) return false;
                return true;
            }
            
        /* bytearray(source=b"")
         * bytearray(source, encoding)
         * bytearray(source, encoding, errors) #not doing this yet
         * Return a new array of bytes. The bytearray class is a mutable sequence 
         * of integers in the range 0 <= x < 256. It has most of the usual methods 
         * of mutable sequences, described in Mutable Sequence Types, as well as 
         * most methods that the bytes type has, see Bytes and Bytearray Operations.
         * The optional source parameter can be used to initialize the array in 
         * a few different ways: If it is a string, you must also give the encoding 
         * (and optionally, errors) parameters; bytearray() then converts the 
         * string to bytes using str.encode(). If it is an integer, the array will 
         * have that size and will be initialized with null bytes. If it is an 
         * object conforming to the buffer interface, a read-only buffer of the 
         * object will be used to initialize the bytes array. If it is an iterable, 
         * it must be an iterable of integers in the range 0 <= x < 256, which 
         * are used as the initial contents of the array. Without an argument, 
         * an array of size 0 is created. See also Binary Sequence Types — bytes, 
         * bytearray, memoryview and Bytearray Objects.
         */
         
            //string variant
            public static byte[] bytearray(String source) {
                return source.getBytes(StandardCharsets.UTF_8);
            }
            
            //integer variant
            public static byte[] bytearray (int source) {
                return new byte[source];
            }
            
            //iterable variant
            public static byte[] collectionToBytes(Collection<Integer> collection) {
                ByteBuffer byteBuffer = ByteBuffer.allocate(collection.size() * Integer.BYTES);
                for (Integer num : collection) {
                    byteBuffer.putInt(num);
                }
                return byteBuffer.array();
            }       
        
}
