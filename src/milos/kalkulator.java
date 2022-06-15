package milos;
import  java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {

        Scanner nekiObj = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("Unesite m ");
        float m = nekiObj.nextFloat();
        System.out.println("Unesite v ");

        float v = nekiObj.nextFloat();

        System.out.println("+: " + (m + v));
        System.out.println("-: " + (m - v));
        System.out.println("*: " + (m * v));
        System.out.println("/: " + (m / v));
        nekiObj.close();
        System.out.println("---------------");
    }

}

