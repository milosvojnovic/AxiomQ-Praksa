package MilošVojnović;

public class MetodeOverloading {
    public static int sameName(int x, int y) {
        return x + y;
    }

    public static String sameName(String x, String y) {
        return x + " " + y;
    }

    public static double sameName(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {

        System.out.println(sameName(5, 10));
        System.out.println(sameName("asdas", "asdasda"));

        System.out.println(sameName(5.0, 10.0));
    }
}
