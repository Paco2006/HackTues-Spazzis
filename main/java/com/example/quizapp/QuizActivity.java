package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private String selectedTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final LinearLayout planet = findViewById(R.id.planetLayout);
        final LinearLayout astrou = findViewById(R.id.astrouLayout);
        final LinearLayout rocket = findViewById(R.id.rocketLayout);

        final Button quizz = findViewById(R.id.stqzBtn);

        planet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic= "planet";

                planet.setBackgroundResource(R.drawable.round_back_white_stroke);

                astrou.setBackgroundResource(R.drawable.round_back_white_stroke);
                rocket.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });

        astrou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "astrou";

                astrou.setBackgroundResource(R.drawable.round_back_white_stroke);

                planet.setBackgroundResource(R.drawable.round_back_white_stroke);
                rocket.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });

        rocket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "rocket";

                rocket.setBackgroundResource(R.drawable.round_back_white_stroke);

                planet.setBackgroundResource(R.drawable.round_back_white_stroke);
                astrou.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });

        quizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTopic.isEmpty()){
                    Toast.makeText(QuizActivity.this, "Please select a Topic", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(QuizActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopicName", selectedTopic);
                    startActivity(intent);
                }
            }
        });
        final String getSelectedDifficultyLevel = getIntent().getStringExtra("selectedDiff");
    }
}