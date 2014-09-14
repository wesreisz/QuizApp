package com.wesleyreisz.quizapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class QuizActivity extends Activity {
    private Question[] questions = QuestionUtil.loadQuestions();
    private int lastDisplayQuestion = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Question question = questions[lastDisplayQuestion++];

        TextView questionText = (TextView)findViewById(R.id.txtQuestion);
        questionText.setText(question.getQuestion() + ":");

        TextView answerA = (TextView)findViewById(R.id.txtAnswerA);
        answerA.setText(question.getOptionMap().get("A"));

        TextView answerB = (TextView)findViewById(R.id.txtAnswerB);
        answerB.setText(question.getOptionMap().get("B"));

        TextView answerC = (TextView)findViewById(R.id.txtAnswerC);
        answerC.setText(question.getOptionMap().get("C"));

        TextView answerD = (TextView)findViewById(R.id.txtAnswerD);
        answerD.setText(question.getOptionMap().get("D"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
