package MilošVojnović;
import  java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner someObj = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("Enter a ");
        float a = someObj.nextFloat();
        System.out.println("Enter b ");

        float b = someObj.nextFloat();

        System.out.println("+: " + (a + b));
        System.out.println("-: " + (a - b));
        System.out.println("*: " + (a * b));
        System.out.println("/: " + (a / b));
        someObj.close();
        System.out.println("---------------");
    }

}

