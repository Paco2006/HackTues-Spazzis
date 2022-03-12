package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class QuizActivity extends AppCompatActivity {

    private String selectedTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final LinearLayout planetLayout = findViewById(R.id.planetLayout);
        final LinearLayout astrouLayout = findViewById(R.id.astrouLayout);
        final LinearLayout rocketLayout = findViewById(R.id.rocketLayout);

        final Button quizz = findViewById(R.id.stqzBtn);

        planetLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic= "planetLayout";

                planetLayout.setBackgroundResource(R.drawable.round_back_white_stroke);

                astrouLayout.setBackgroundResource(R.drawable.difficulty);
                rocketLayout.setBackgroundResource(R.drawable.difficulty);
            }
        });

        astrouLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "astrouLayout";

                astrouLayout.setBackgroundResource(R.drawable.round_back_white_stroke);

                planetLayout.setBackgroundResource(R.drawable.difficulty);
                rocketLayout.setBackgroundResource(R.drawable.difficulty);
            }
        });

        rocketLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "rocketLayout";

                rocketLayout.setBackgroundResource(R.drawable.round_back_white_stroke);

                planetLayout.setBackgroundResource(R.drawable.difficulty);
                astrouLayout.setBackgroundResource(R.drawable.difficulty);
            }
        });

        quizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTopic.isEmpty()){
                    Toast.makeText(QuizActivity.this, "Please select a Topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(QuizActivity.this, QuestionActivity.class);
                    intent.putExtra("selectedTopicName", selectedTopic);
                    startActivity(intent);
                }
            }
        });
        final String getSelectedDifficultyLevel = getIntent().getStringExtra("selectedDiff");
    }
}