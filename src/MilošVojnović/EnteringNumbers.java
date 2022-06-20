package MilošVojnović;
import  java.util.Scanner;
public class EnteringNumbers {
    public static void main(String[] args) {
        Scanner someObj = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("1 number: ");

        int number1 = someObj.nextInt();

        System.out.println("2 number is: ");
        int number2 = someObj.nextInt();


        if (number1 < number2) {
            System.out.println(number1 + " is smaller than " + number2 + ".");
        } else if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2 + ".");
        } else {
            System.out.println(number1 + " and " + number2 + " are same.");
        }
    }
}
