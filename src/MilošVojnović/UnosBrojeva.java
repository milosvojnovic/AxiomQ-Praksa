package MilošVojnović;
import  java.util.Scanner;
public class UnosBrojeva {
    public static void main(String[] args) {
        Scanner nekiObj2 = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("1 broj: ");

        int broj1 = nekiObj2.nextInt();

        System.out.println("2 broj je: ");
        int broj2 = nekiObj2.nextInt();


        if (broj1 < broj2) {
            System.out.println(broj1 + " je manji od " + broj2 + ".");
        } else if (broj1 > broj2) {
            System.out.println(broj1 + " je veci od " + broj2 + ".");
        } else {
            System.out.println(broj1 + " i " + broj2 + " su isti.");
        }
    }
}
