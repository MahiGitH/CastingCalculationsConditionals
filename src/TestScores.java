import java.util.Scanner;

public class TestScores {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Name a number between 0 and 100");
    int x = scanner.nextInt();
    if (x>=90){
      System.out.println("Your grade is A ;)");
    } else if (x>=80){
      System.out.println("Your grade is B :)");
    } else if (x>=70){
      System.out.println("Your grade is C :|");
    } else if (x>=60) {
      System.out.println("Your grade is D :/ ");
    } else {
      System.out.println("Your grade is F :(");
    }

    scanner.close();
  }
}
