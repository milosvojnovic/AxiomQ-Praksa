package MilošVojnović.Kviz;

import java.util.Scanner;

public class Pitanja {
    public static void main(String[] args) {
    String q1="Glavni grad americke drzave Vajoming je?"
            +"\n(a)Sajen\n(b)Podgorica\n(c)Novi Sad\n";
    String q2="Koji je glavni grad Indonezije?"
            +"\n(a)Abuja\n(b)Đakarta\n(c)Akropolj\n";
        String q3="Kako se zvao prvi srpski patrijarh?"
                +"\n(a)Sveti Sava\n(b)Sveti Joanikije\n(c)Sveti Mihailo\n";
    Odgovori []questions={
            new Odgovori(q1,"a"),
            new Odgovori(q2,"b"),
            new Odgovori(q3,"c")
    };
    takeTest(questions);

}
public  static void takeTest(Odgovori[]questions){
    int score=0;
    Scanner keyboardInput = new Scanner((System.in));
    for( int i =0;i<questions.length;i++){
        System.out.println(questions[i].prompt);
        String answer= keyboardInput.nextLine();
        if(answer.equals((questions[i].answer))){
            score++;
        }

    }
    System.out.println("Tacno ste odgovorili na "+score+ " od "+questions.length+" postavljenih pitanja.");
}
}
