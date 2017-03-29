package com.example.cmltdstudent.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText loginUN;
    private EditText loginPW;
    private Button playGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginUN = (EditText) findViewById(R.id.username_fillin);
        loginPW = (EditText) findViewById(R.id.password_fillin);
        playGame = (Button) findViewById(R.id.play_button);

    }

    public void openCharacterScreen (View view)
    {
        Intent i = new Intent(this, CharacterScreen.class);
        startActivity(i);
    }
}
