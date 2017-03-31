package com.example.cmltdstudent.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LevelScreen extends AppCompatActivity {

    private Button levelOne;
    private Button levelTwo;
    private Button levelThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_screen);

        levelOne = (Button) findViewById(R.id.level_one_button);
        levelTwo = (Button) findViewById(R.id.level_two_button);
        levelThree = (Button) findViewById(R.id.level_three_button);

    }

    public void openProblemType(View view) {
        Intent i = new Intent(this, ProblemTypeScreen.class);
        startActivity(i);
    }
}
