package com.example.cmltdstudent.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class PreGameSummary extends AppCompatActivity {

    private TextView displayText;

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference userRef = database.getReference("overview");
    private ArrayList<UserInfo> infoSum = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_game_summary);


        displayText = (TextView) findViewById(R.id.display_text);

        userRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                UserInfo.add(dataSnapshot.getValue(UserInfo.class));
                displayInfo();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                Toast.makeText(PreGameSummary.this, dataSnapshot.getValue(UserInfo.class) + " has changed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                Toast.makeText(PreGameSummary.this, dataSnapshot.getValue(UserInfo.class) + " is removed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }

        });
    }

    private void displayInfo() {
        String text = "";
        for (UserInfo s : infoSum)
            text += s + "\n";
        displayText.setText(text);
    }

    public void openWordProblems(View view) {
        Intent i = new Intent(this, WordProblems.class);
        startActivity(i);
    }

    public void openArithmetic(View view) {
        Intent i = new Intent(this, Arithmetic.class);
        startActivity(i);
    }

}
