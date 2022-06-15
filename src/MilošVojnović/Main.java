package MilošVojnović;

import java.util.Date;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //pocetak
        System.out.println("Dobar dan");
        System.out.println("Kako ste");
        System.out.print("Da li ");// ista linija
        System.out.print("vam nesto treba?");
        System.out.println("--------------------------");
        //varijable
        int width = 30;
        int height = 3;
        int area = width * height;
        System.out.println("Resenje je" + area + ".");
        final int Hz = 10;//konstante
        System.out.println("Broj" + Hz + "Hz");
        System.out.println("--------------------------");
        //Data types
        int godine = 13;
        String vrednost = "Cao";
        char slovo = 'A';
        long velikibr = 1_000_000;
        float nesto = 10.4F;
        Date sad = new Date();
        System.out.println(godine);
        System.out.println(vrednost);
        System.out.println(velikibr);
        System.out.println(slovo);
        System.out.println(nesto);
        System.out.println(sad);
        System.out.println("--------------------------");
        //izmena
        int prvaiz = 10;//1
        float drugaiz = prvaiz;//2
        System.out.println(prvaiz);
        System.out.println(drugaiz);
        System.out.println("--------------------------");
        double nekavrednost = 3.14;
        int novavrednostd = (int) nekavrednost;
        float novavreednostf = (float) novavrednostd;
        System.out.println(nekavrednost);
        System.out.println(novavrednostd);
        System.out.println(novavreednostf);
        System.out.println("--------------------------");
        //aritmeticke operacije
        float x = 10;// za precizne brojeve
        float y = 5;
        System.out.println("zbir " + (x + y));
        System.out.println("oduzimanje " + (x - y));
        System.out.println("mnozi " + (x * y));
        System.out.println("deli " + (x / y));
        System.out.println("Mod " + (x % y));
        System.out.println("--------------------------");
        int a = 10;
        int b = 81;
        int c = -5;
        System.out.println("Max: " + (Math.max(a, b)));
        System.out.println("Min: " + (Math.min(a, b)));
        System.out.println("Sqrt: " + (Math.sqrt(b)));
        System.out.println("Abs: " + (Math.abs(c)));
        System.out.println("Neki broj: " + (Math.random()));
        ;
        System.out.println("--------------------------");
        /*

        //Kalkulator10
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
        */
        // if provera
        /*
        int proveri = 58;

        if (proveri < 11) {
            System.out.println("manji od 20");
        }
        else if (proveri > 11) {
            System.out.println("veci od 20");
        }
        else {
            System.out.println("isti broj");
        }
        System.out.println("--------------------------");
        */
        /*
        //provera kroz brojeve
        int h = 58;
        int j=110;

        if (h< j) {
            System.out.println(h+" je manji od "+j);
        }
        else if (h > j) {
            System.out.println(h+" je veci od "+j);
        }
        else {
            System.out.println(h+" i "+j+" su jednaki");
        }
        System.out.println("--------------------------");
        */
        /*
        // sa unosom brojeva
        Scanner nekiObj2 = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("1 broj: ");

        int broj1 = nekiObj2.nextInt();

        System.out.println("2 broj je: ");
        int  broj2= nekiObj2.nextInt();


        if (broj1 < broj2) {
            System.out.println(broj1 + " je manji od " + broj2+".");
        } else if (broj1 > broj2) {
            System.out.println(broj1 + " je veci od " + broj2+".");
        } else {
            System.out.println(broj1+" i "+broj2+" su isti.");
        }
        */
        //loops
        /*for (int p = 10; p >= 0; p = p - 1) {
            System.out.println(p);*/
        char[] charArr = {'A', 'B', 'Z', 'Z', 'Z'};

        for (char k : charArr) {
            System.out.println(k);
        }

        // Switch  case

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
