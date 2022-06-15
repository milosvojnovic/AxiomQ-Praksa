package milos;

public class ifprovera {
    public static void main(String[] args) {
        int proveri = 58;

        if (proveri < 11) {
            System.out.println("manji od 20");
        } else if (proveri > 11) {
            System.out.println("veci od 20");
        } else {
            System.out.println("isti broj");
        }
        System.out.println("--------------------------");
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
    }
}
