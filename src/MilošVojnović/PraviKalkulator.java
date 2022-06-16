package MilošVojnović;
import  java.util.Scanner;
public class PraviKalkulator {
    public static void main(String[] args) {

        char znak;
        Double prvibroj, drugibroj, rezultat;


        Scanner input = new Scanner(System.in);


        System.out.println("Odaberite operaciju: +, -, *, or /");
        znak = input.next().charAt(0);

        System.out.println("Unesite prvi broj");
        prvibroj = input.nextDouble();

        System.out.println("Unesite drugi broj");
        drugibroj = input.nextDouble();

        switch (znak) {

            // sabiranje
            case '+':
                rezultat = prvibroj + drugibroj;
                System.out.println(prvibroj + " + " + drugibroj + " = " + rezultat);
                break;

            // oduzimanje
            case '-':
                rezultat = prvibroj - drugibroj;
                System.out.println(prvibroj + " - " + drugibroj + " = " + rezultat);
                break;

            // mnozenje
            case '*':
                rezultat = prvibroj * drugibroj;
                System.out.println(prvibroj + " * " + drugibroj + " = " + rezultat);
                break;

            // deljenje
            case '/':
                rezultat = prvibroj / drugibroj;
                System.out.println(prvibroj + " / " + drugibroj + " = " + rezultat);
                break;

            default:
                System.out.println("Uneli ste nepostojucu operaciju!");
                break;
        }

        input.close();
    }
}
