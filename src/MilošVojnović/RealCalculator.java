package MilošVojnović;
import  java.util.Scanner;
public class RealCalculator {
    public static void main(String[] args) {

        char sign;
        Double firstnumber, secondnumber,result;

        Scanner input = new Scanner(System.in);


        System.out.println("Select operation: +, -, *, or /");
        sign = input.next().charAt(0);

        System.out.println("Enter the first number");
        firstnumber = input.nextDouble();

        System.out.println("Enter another number");
        secondnumber = input.nextDouble();

        switch (sign) {

            // addition
            case '+':
                result = firstnumber + secondnumber;
                System.out.println(firstnumber + " + " + secondnumber + " = " + result);
                break;

            // subtraction
            case '-':
                result = firstnumber - secondnumber;
                System.out.println(firstnumber + " - " + secondnumber + " = " + result);
                break;

            // multiplication
            case '*':
                result = firstnumber * secondnumber;
                System.out.println(firstnumber + " * " + secondnumber + " = " + result);
                break;

            // sharing
            case '/':
                result = firstnumber / secondnumber;
                System.out.println(firstnumber + " / " + secondnumber + " = " + result);
                break;

            default:
                System.out.println("You entered a non-existent operation!");
                break;
        }

        input.close();
    }
}
