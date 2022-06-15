package milos;

public class AritmetickeOperacije {
    public static void main(String[] args) {
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
    }
}
