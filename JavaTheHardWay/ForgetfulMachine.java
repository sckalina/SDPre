import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?" );
    keyboard.next();

    System.out.println( "What is 6 multiplied by 7?" );
    keyboard.nextInt();
    // The second question blows up program when I type 34.2
    System.out.println( "Enter a number between 0.0 and 1.0." );
    keyboard.nextDouble();
    // I couldn't get the program to blow up. I tried 8, 8.0, 8.888
    System.out.println( "Is there anything else you would like to say?" );
    keyboard.next();
  }
}
