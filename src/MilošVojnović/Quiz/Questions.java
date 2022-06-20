package MilošVojnović.Quiz;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        String q1="The capital of the US state of Wyoming is?"
                +"\n(a)Sajen\n(b)Podgorica\n(c)Novi Sad\n";
        String q2="Which is the capital of Indonesia?"
                +"\n(a)Abuja\n(b)Đakarta\n(c)Akropolj\n";
        String q3="What was the name of the first Serbian patriarch?"
                +"\n(a)Sveti Sava\n(b)Sveti Joanikije\n(c)Sveti Mihailo\n";
        Answers[]questions={
                new Answers(q1,"a"),
                new Answers(q2,"b"),
                new Answers(q3,"c")
        };
        takeTest(questions);

    }
    public  static void takeTest(Answers[]questions){
        int score=0;
        Scanner keyboardInput = new Scanner((System.in));
        for( int i =0;i<questions.length;i++){
            System.out.println(questions[i].prompt);
            String answer= keyboardInput.nextLine();
            if(answer.equals((questions[i].answer))){
                score++;
            }


        }
        System.out.println("You answered correctly "+score+ " from the "+questions.length+" questions asked.");
    }
}
