package JavaWeek3WritingHomeworkSanketPatel;
import java.util.Scanner;
public class Programme2LeapYear {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year");
        int year = scanner.nextInt();
        Programme2LeapYear leapYear = new Programme2LeapYear();
        leapYear.isItLeapYear(year);
        //closing the scanner object
        scanner.close();
    }

    // checking is it leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The year " + year + " is leap year");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");
    }
}
