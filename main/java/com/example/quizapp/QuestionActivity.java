package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        final ImageView backbutton = findViewById(R.id.backbutton);
        final TextView timerLayout = findViewById(R.id.timerLayout);
        final TextView selectedTopic = findViewById(R.id.topicName);

        final String getSelectedTopic = getIntent().getStringExtra("selectedTopicName");

        selectedTopic.setText(getSelectedTopic);
    }
}