package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedDifficultyLevel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout easy = findViewById(R.id.easyLayout);
        final LinearLayout medium = findViewById(R.id.mediumLayout);
        final LinearLayout hard = findViewById(R.id.hardLayout);

        final Button topic = findViewById(R.id.gtopBtn);


        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedDifficultyLevel = "easy";

                easy.setBackgroundResource(R.drawable.round_back_white_stroke);

                medium.setBackgroundResource(R.drawable.round_back_white_stroke);
                hard.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedDifficultyLevel = "medium";

                medium.setBackgroundResource(R.drawable.round_back_white_stroke);

                easy.setBackgroundResource(R.drawable.round_back_white_stroke);
                hard.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedDifficultyLevel = "hard";

                hard.setBackgroundResource(R.drawable.round_back_white_stroke);

                easy.setBackgroundResource(R.drawable.round_back_white_stroke);
                medium.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });

        topic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedDifficultyLevel.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please select a Difficulty level", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedDifficultyLevel", selectedDifficultyLevel);
                    startActivity(intent);
                }
            }
        });
    }
}