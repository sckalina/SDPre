import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int number;

    System.out.println( "Please enter a number: " );
    number = keyboard.nextInt();

    if (number % 2 == 0) {
      System.out.println( "This number is even." );
    }
    else if (number % 2 > 0) {
      System.out.println( "This number is odd.");
    }
  }
}
