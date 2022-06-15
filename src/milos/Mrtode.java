package milos;

public class Mrtode {
/*
    public static void Printer() {
        System.out.println("ja sam  simplePrinter ");
    }

    public static void pozivi() {

        backup();
        backup();
        backup();
    }

 */
public static int kalk(int x, int y) {
    int rezultat = x + y;
    return rezultat;
}

    public static void doubleIt(int x, int y) {
        int drezultat = (kalk(x, y) * 2);
        System.out.println(drezultat);
    }



    public  static  void main (String[]args){
        //pozivi();
        System.out.println("Rezultat: "+kalk(5, 5));

        doubleIt(5, 5);
    }
   /* public static void backup() {
        System.out.println("ja sam backupPrinter ");
    }*/
}
