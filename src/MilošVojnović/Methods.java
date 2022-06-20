package MilošVojnović;

public class Methods {
/*
    public static void Printer() {
        System.out.println("I am simplePrinter ");
    }

    public static void calls() {

        backup();
        backup();
        backup();
    }

 */


public static int kalk(int x, int y) {
    int result = x + y;
    return result;
}

    public static void doubleIt(int x, int y) {
        int dresult = (kalk(x, y) * 2);
        System.out.println(dresult);
    }



    public  static  void main (String[]args){
        //calls();
        System.out.println("Result: "+kalk(5, 5));

        doubleIt(5, 5);
    }
   /* public static void backup() {
        System.out.println("I am backupPrinter ");
    }*/
}
