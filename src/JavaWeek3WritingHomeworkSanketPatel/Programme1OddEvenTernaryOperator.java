package JavaWeek3WritingHomeworkSanketPatel;
import java.util.Scanner;
/** Write a java program that tells us that Input number is odd or even?
 * Hint: use ternary operator (? :)
 */
public class Programme1OddEvenTernaryOperator {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        // closing the scanner object
        scanner.close();
    }

    //Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}