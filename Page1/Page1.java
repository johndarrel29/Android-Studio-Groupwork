package com.example.votingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUserAge = findViewById(R.id.etUserAge);
        Button btnCheckEligibility = findViewById(R.id.btnCheckEligibility);

        btnCheckEligibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkEligibility(etUserAge.getText().toString());
            }
        });
    }

    private void checkEligibility(String ageText) {
        if (!ageText.isEmpty()) {
            if (isNumeric(ageText)) {
                int age = Integer.parseInt(ageText);

                if (age >= 15 && age <=30) {
                    Intent intent = new Intent(Page1.this, Secondpage.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Sorry, voting is limited to individuals between the ages of 15 and 30.", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Please enter a valid age (numeric value).", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Please enter your age.", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
