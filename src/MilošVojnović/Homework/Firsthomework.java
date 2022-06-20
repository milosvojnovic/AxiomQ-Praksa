package MilošVojnović.Homework;

public class Firsthomework {
    public static void main(String[] args) {


}
    //sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
    //diff21
    public int diff21(int n) {
        if (n<=21) {
            return 21 -n;
        } else {
            return (n-21) * 2;
        }
    }
    //nearHundred
    public boolean nearHundred(int n) {
        return ((Math.abs(100 -n) <= 10) ||
                (Math.abs(200 -n) <= 10));
    }
    //missingChar
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);

        String back = str.substring(n+1, str.length());

        return front + back;
    }
    //backAround
    public String backAround(String str) {

        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
    //startHi
    public boolean startHi(String str) {

        if (str.length()< 2) return false;

        String firstTwo = str.substring(0,2);

        if (firstTwo.equals("Hi")) {
            return true;
        } else {
            return false;
        }
    }
}
