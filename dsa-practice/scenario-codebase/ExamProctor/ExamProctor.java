import java.util.*;
public class ExamProctor {

    static HashMap<Integer , String> answers = new HashMap<>();
    static Stack<Integer> navigation = new Stack<>();
    static HashMap<Integer , String> correctAns = new HashMap<>();


    

    static int calculateScore(){
        int score = 0;
        for(int qId : correctAns.keySet()){
            if(answers.containsKey(qId) && answers.get(qId).equals(correctAns.get(qId))){
                score++;

            }

        }
        return score;
        


    }
    static void VisitQuestion(int questionId){
        navigation.push(questionId);
        System.out.println("Visiting Question " + questionId);

    }
    static void SubmitAnswer(int questionId, String answer){
        answers.put(questionId , answer);
        System.out.println("Submitted answer for Question " + questionId);

    }
    public static void main(String[] args) {
        correctAns.put(1, "A");
        correctAns.put(2, "C");
        correctAns.put(3, "B");

        VisitQuestion(1);
        SubmitAnswer(1,"A");

         VisitQuestion(2);
        SubmitAnswer(2, "B");

        VisitQuestion(3);
        SubmitAnswer(3, "A");

        int score = calculateScore();
        System.out.println("Final Score " + score );

        //last question visited
        System.out.println("Last visited question " + navigation.peek());


    }
}
