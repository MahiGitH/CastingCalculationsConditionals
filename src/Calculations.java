import java.util.Scanner;

public class Calculations {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num1 = scanner.nextInt();
    System.out.println("Enter another number:");
    int num2 = scanner.nextInt();

    // Addition
    int nums = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + nums);

    // Subtraction
    int numSub = num1 -num2;
    System.out.println(num1 + " - " + num2 + " = " + numSub); 
    
    //Multiplication
    int numMultip = num1*num2;
    System.out.println(num1 + " * " + num2 + " = " + numMultip);

    // Division 
    
    Double numDiv = (double)num1/(double)num2;
    System.out.println(num1 + " / " + num2 + " = " + numDiv);
    
    // Modulus
    int numModulus = num1%num2;
    System.out.println(num1 + " % " + num2 + " = " + numModulus);
    scanner.close();
}
}