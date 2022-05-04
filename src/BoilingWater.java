import java.util.Scanner;

public class BoilingWater {
  public static void main(String[] args) throws Exception {
    // If a number is > 212 print water is boiling
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number greater than 212:");
    int myNum = scanner.nextInt();
    
    if (myNum > 212) {
      System.out.println("Water is boiling!");
}
    scanner.close();
}
}
