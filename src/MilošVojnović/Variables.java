package MilošVojnović;

import java.util.Date;

public class Variables {public static void main(String[] args) {
    int width = 30;
    int height = 3;
    int area = width * height;
    System.out.println("The solution is" + area + ".");
    final int Hz = 10;//constants
    System.out.println("Number" + Hz + "Hz");
    System.out.println("--------------------------");
    //Data types
    int years = 13;
    String value = "Cao";
    char word = 'A';
    long largenumbers = 1_000_000;
    float something = 10.4F;
    Date now = new Date();
    System.out.println(years);
    System.out.println(value);
    System.out.println(largenumbers);
    System.out.println(word);
    System.out.println(something);
    System.out.println(now);
    System.out.println("--------------------------");
}
}
