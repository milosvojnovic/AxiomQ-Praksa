package MilošVojnović;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner objekat = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Zbirka pitanja: ");
        System.out.println("Unesite broj željenog pitanja: ");

        int izbor = objekat.nextInt();
        System.out.println("Pitanje broj: " + izbor);

        switch (izbor) {
            case 1:
                System.out.println("Glavni grad americke drzave Vajoming je?");
                System.out.println("1.Sajen");
                System.out.println("2.Beograd");
                System.out.println("3.Podgorica");
                System.out.println("4.Novi Sad");
                System.out.println("Tacan odgovor je pod rednim brojem:");
                int izbor1 = objekat.nextInt();
                System.out.println();
                switch (izbor1){
                    case 1:
                        System.out.println("Tacno ste odgovorili.");
                        break;
                    case 2:
                        System.out.println("Netacno ste odgovorili.");
                        break;
                    case 3:
                        System.out.println("Netacno ste odgovorili.");
                        break;
                    case 4:
                        System.out.println("Netacno ste odgovorili.");
                        break;
                }
                break;
            case 2:
                System.out.println("Kako se zvao prvi srpski patrijarh?");
                System.out.println("1.Sveti Mihailo");
                System.out.println("2.Sveti Sava");
                System.out.println("3.Sveti Joanikije");
                System.out.println("4.Sveti Branko");
                System.out.println("Tacan odgovor je pod rednim brojem:");
                int izbor2 = objekat.nextInt();
                System.out.println();
                switch (izbor2){
                    case 1:
                        System.out.println("Netacno ste odgovorili.");
                        break;
                    case 2:
                        System.out.println("Netacno ste odgovorili.");
                        break;
                    case 3:
                        System.out.println("Tacno ste odgovorili.");
                        break;
                    case 4:
                        System.out.println("Netacno ste odgovorili.");
                        break;
                }
                break;
            case 3:
                System.out.println("Koji je glavni grad Indonezije?");
                System.out.println("1.Abuja");
                System.out.println("2.Đakarta");
                System.out.println("3.Akropolj");
                System.out.println("4.Paris");
                System.out.println("Tacan odgovor je pod rednim brojem:");
                int izbor3 = objekat.nextInt();
                System.out.println();
                switch (izbor3){
                    case 1:
                        System.out.println("Netacno ste odgovorili.");
                        break;
                    case 2:
                        System.out.println("Tacno ste odgovorili.");
                        break;
                    case 3:
                        System.out.println("Netacno ste odgovorili.");
                        break;
                    case 4:
                        System.out.println("Netacno ste odgovorili.");
                        break;
                }
                break;
            default:
                System.out.println("Nepostoji pitanje koje je deklarisano ovim brojem.");

        }
    }
}