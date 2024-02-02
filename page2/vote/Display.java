package com.example.vote;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Display extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        // Testing lang hehe
        TextView president = findViewById(R.id.textView);
        president.setText(Candidate.getPresident().getName());

    }
}
