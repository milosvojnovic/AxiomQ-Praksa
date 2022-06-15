package milos;

import java.util.Date;

public class varijable {public static void main(String[] args) {
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
}
}
