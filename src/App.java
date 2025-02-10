import java.util.*;

/**
 * Task: Write code that will take input and output different messages.
 * 
 * Description: Our code should take in inputs then print a message based on
 * divisibility tests.
 * 
 * Basic task (up to B+ level): Take input from the user. Output if the number
 * is even or odd.
 * 
 * Moderate task (up to A level): Do all of the above AND check to see if the
 * number is divisible
 * by 3 and/or 5:
 * If the number is divisible by 3, print "The number is divisible by 3."
 * If the number is divisible by 5, print "The number is divisible by 5."
 * If divisible by both 3 and 5, print "The number is divisible by both 3 and
 * 5."
 * 
 * Challenge task (up to A+ level): Complete both of the above AND check to see
 * if the number
 * is greater than 0 and less than 100. If the number is less than 0 or above
 * 100, say "Wrong number!".
 * If the number is between 0 and 100, check to see if it is a prime number. A
 * prime number less than
 * 100 should be divisible by itself and 1 but not by 2, 3, 5, or 7.
 * 
 * i made mine interactive ( yay !) its a lot funner that way i guess
 */

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int number = Integer.valueOf(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.println("Your number is even");
            if (number % 3 == 0) {
                if (number % 5 == 0) {
                    System.out.println("Your number is divisible by both three and five");
                } else {
                    System.out.println("Your number is also divisible by three");
                }
            } else if (number % 5 == 0) {
                System.out.println("Your number is also divisible by five");
            }
        } else if (number % 3 == 0) {
            if (number % 5 == 0) {
                System.out.println("Your number is odd and divisible by both five and three");
            } else {
                System.out.println("Your number is odd and divisible by three");
            }
        } else if (number % 5 == 0) {
            System.out.println("Your number is odd and divisible by five");
        } else {
            System.out.println("Your number is odd");
        }
        System.out.println("Want me to check if your number is prime? (enter 100 to check, any other number if not)");
        int yesno = Integer.valueOf(scanner.nextLine());
        if (yesno == 100) {
            System.out.println("Okay then, lets check");
        if (number < 0) {
            System.out.println("Sorry, the number must be more than zero.");
        } else if (number > 100) {
            System.out.println("Sorry, the number must be less than one hundred");
        } else if (number % 2 == 0) {
            if (number == 2) {
                System.out.println("Your number is prime");
            } else {
                System.out.println("Your number isn't prime");
            }
        } else if (number % 3 == 0) {
            if (number == 3) {
                System.out.println("Your number is prime");
            } else {
                System.out.println("Your number isn't prime");
        } } else if (number % 5 == 0) {
            if (number == 5) {
                System.out.println("Your number is prime");
            } else {
                System.out.println("Your number isn't prime");
        } } else if (number % 7 == 0) {
            if (number == 7) {
                System.out.println("Your number is prime");
            } else {
                System.out.println("Your number isn't prime");
            }
        }
        
         else {
            System.out.println("Your number is prime");
        }
    } else {
            System.out.println("Okay, maybe next time");
        }

    }
}
