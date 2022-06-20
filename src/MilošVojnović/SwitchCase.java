package MilošVojnović;

import java.util.Scanner;

public class SwitchCase {
   /* public void wonCode(String customQuestion1,String customQuestion2, String customQuestion3,String customQuestion4){
        //all the code that is the same copy paste
        //and then replace only the code that changes with the method arguments
        //we will drastically reduce the number of lines of code
        //and the code will be more readable
    }
*/

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Collection of questions: ");
        System.out.println("Enter the number of the desired question: ");

        int choice = object.nextInt();
        System.out.println("Question number: " + choice);


        switch (choice) {
            case 1:
                System.out.println("The capital of the US state of Wyoming is?");
                System.out.println("1.Sajen");
                System.out.println("2.Belgrade");
                System.out.println("3.Podgorica");
                System.out.println("4.Novi Sad");
                System.out.println("The correct answer is under the ordinal number:");
                int choice1 = object.nextInt();
                System.out.println();
                switch (choice1){
                    case 1:
                        System.out.println("You answered correctly.");
                        break;
                    case 2:
                        System.out.println("You answered incorrectly.");
                        break;
                    case 3:
                        System.out.println("You answered incorrectly.");
                        break;
                    case 4:
                        System.out.println("You answered incorrectly.");
                        break;
                }
                break;
            case 2:
                System.out.println("What was the name of the first Serbian patriarch?");
                System.out.println("1.Sveti Mihailo");
                System.out.println("2.Sveti Sava");
                System.out.println("3.Sveti Joanikije");
                System.out.println("4.Sveti Branko");
                System.out.println("The correct answer is under the ordinal number:");
                int choice2 = object.nextInt();
                System.out.println();
                switch (choice2){
                    case 1:
                        System.out.println("You answered incorrectly.");
                        break;
                    case 2:
                        System.out.println("You answered incorrectly.");
                        break;
                    case 3:
                        System.out.println("You answered correctly.");
                        break;
                    case 4:
                        System.out.println("You answered incorrectly.");
                        break;
                }
                break;
            case 3:
                System.out.println("What is the capital of Indonesia?");
                System.out.println("1.Abuja");
                System.out.println("2.Đakarta");
                System.out.println("3.Akropolj");
                System.out.println("4.Paris");
                System.out.println("The correct answer is under the ordinal number:");
                int choice3 = object.nextInt();
                System.out.println();
                switch (choice3){
                    case 1:
                        System.out.println("You answered incorrectly.");
                        break;
                    case 2:
                        System.out.println("You answered correctly.");
                        break;
                    case 3:
                        System.out.println("You answered incorrectly.");
                        break;
                    case 4:
                        System.out.println("You answered incorrectly.");
                        break;
                }
                break;
            default:
                System.out.println("There is no question declared in this issue.");

        }
    }
}