package com.wesleyreisz.quizapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * Created by wesleyreisz on 9/14/14.
 */
public class QuestionUtil {
    public static Question[] loadQuestions(){
        List<Question>questions = new ArrayList<Question>();
        String questionText;
        String answer;
        Map<String,String> options;
        Question question;

        //question 1
        questionText = "Duke is the mascot for";
        answer = "A";
        options = new HashMap<String, String>();
        options.put("A", "Java");
        options.put("B", "Git");
        options.put("C", "GitHub");
        options.put("D", "Android");

        question = new Question(questionText, answer, options);
        questions.add(question);

        //question 2
        questionText = "Android's default runtime Virtual Machine is";
        answer = "B";
        options = new HashMap<String, String>();
        options.put("A", "Java");
        options.put("B", "Dalvik");
        options.put("C", "ART");
        options.put("D", "CLR");

        question = new Question(questionText, answer, options);
        questions.add(question);

        //return array
        Question[] questionArray = new Question[questions.size()];
        return questions.toArray(questionArray);
    }
}
