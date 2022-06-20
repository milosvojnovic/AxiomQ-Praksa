package MilošVojnović;

public class ArithmeticOperations {
    public static void main(String[] args) {
        float x = 10;// za precizne brojeve
        float y = 5;
        System.out.println("sum " + (x + y));
        System.out.println("subtraction " + (x - y));
        System.out.println("multiplication " + (x * y));
        System.out.println("sharing " + (x / y));
        System.out.println("since " + (x % y));
        System.out.println("--------------------------");
        int a = 10;
        int b = 81;
        int c = -5;
        System.out.println("Max: " + (Math.max(a, b)));
        System.out.println("Min: " + (Math.min(a, b)));
        System.out.println("Sqrt: " + (Math.sqrt(b)));
        System.out.println("Abs: " + (Math.abs(c)));
        System.out.println("Some number: " + (Math.random()));
        ;
        System.out.println("--------------------------");
    }
}
