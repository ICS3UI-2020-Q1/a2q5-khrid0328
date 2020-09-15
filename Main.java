import java.util.Scanner;

/**
 * The program asks the user for a single integer and lets the user know what the correct word to be spoken is
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number to play
    System.out.println("Please enter a number to play FizzBuzz");

    // declare and initialize the number choosen by user
    int number = input.nextInt();

    // calculate the remainder when dividing by 3
    int quotien_3 = number % 3;

    // calculate the remainder when dividing by 5
    int quotien_5 = number % 5;

    if(quotien_3 == 0 && quotien_5 == 0){
      // tell the user they need to say FizzBuzz
      System.out.println("You should say FizzBuzz");
    
    }else if(quotien_5 == 0){
      // tell the use they need to say Buzz
     System.out.println("You should say Buzz");

    }else if(quotien_3 == 0){
      // tell the user they need to say Fizz
      System.out.println("You should say Fizz");

    }else if(quotien_3 != 0 || quotien_5 != 0){
      // tell user to say original number
      System.out.println("You should say " + number);
    }
  }
}
