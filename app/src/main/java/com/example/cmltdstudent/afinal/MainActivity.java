package com.example.cmltdstudent.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private FirebaseAuth auth = FirebaseAuth.getInstance();
    private FirebaseAuth.AuthStateListener authListener;

    private EditText loginUN;
    private EditText loginPW;
    private Button playGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null)
                    startActivity(new Intent(MainActivity.this, SignUp.class));
            }
        };


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
