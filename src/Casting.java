public class Casting {
    public static void main(String[] args) throws Exception {
        /******************Q1***********************/
        //Create double type variable
        double x = 112.35;
        System.out.println("Double: " + x);
        //Convert double into int type
        int y = (int)x;
        System.out.println("int: " + y);

        /******************Q2*********************/
        // Create a string type variable
        String m = "49";
        System.out.println("The string value is: " + m);
        // Convert string into int type
        int t = Integer.parseInt(m);
        System.out.println("The integer value is: "+t);
        
    }
}
