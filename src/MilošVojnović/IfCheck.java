package MilošVojnović;

public class IfCheck {
    public static void main(String[] args) {
        int check = 58;

        if (check < 11) {
            System.out.println("Smaller than 20");
        } else if (check > 11) {
            System.out.println("Greater than 20");
        } else {
            System.out.println("Same number");
        }
        System.out.println("--------------------------");
        int a = 58;
        int b =110;

        if (a< b) {
            System.out.println(a+" is less than "+b);
        }
        else if (a > b) {
            System.out.println(a+" is greater than "+b);
        }
        else {
            System.out.println(a+" and "+b+" are equal");
        }
        System.out.println("--------------------------");
    }
}
