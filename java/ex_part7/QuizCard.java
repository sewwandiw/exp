package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/27/13
 * 7:42 PM
 */
 import java.io.*;
public class QuizCard implements Serializable  {
    String question;
    String answer;
    public QuizCard(String questionText, String answerText) {
        question = questionText;
        answer = answerText;

    }

    public String getAnswer(){
         return answer;
    }

    public String getQuestion(){
        return question;
    }
}
