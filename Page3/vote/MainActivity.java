package com.example.vote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int chosenPresidentPhoto = 0;
    public int chosenVicePresidentPhoto = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vote);

        AutoCompleteTextView inputPresident = findViewById(R.id.inputPresident);
        String[] presidentCandidates = Candidate.presidentCandidates;
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, presidentCandidates);
        inputPresident.setAdapter(adapter1);

        AutoCompleteTextView inputVicePresident = findViewById(R.id.inputVicePresident);
        String[] vicePresidentCandidates = Candidate.vicePresidentCandidates;
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, vicePresidentCandidates);
        inputVicePresident.setAdapter(adapter2);


        Button buttonSubmit = findViewById(R.id.buttonSubmit);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String chosenPresident = inputPresident.getText().toString().trim();
                String chosenVicePresident = inputVicePresident.getText().toString().trim();

                boolean talliedVote = tallyVote(chosenPresident, chosenVicePresident);

                if (talliedVote) {
                    Intent intent = new Intent(MainActivity.this, Result.class);

                    intent.putExtra("president_name", chosenPresident);
                    intent.putExtra("vice_president_name", chosenVicePresident);
                    intent.putExtra("president_image", chosenPresidentPhoto);
                    intent.putExtra("vice_president_image", chosenVicePresidentPhoto);

                    startActivity(intent);
                }
            }
        });
    }

    public boolean tallyVote(String presidentCandidate, String vicePresidentCandidate) {
        String president;
        String vicePresident;
        int pImage;
        int vpImage;

        Candidate candidatePresident1 = new Candidate();
        Candidate candidatePresident2 = new Candidate();
        candidatePresident1.setName("Thea Nery");
        candidatePresident2.setName("Emlan Implica");

        Candidate candidateVicePresident1 = new Candidate();
        Candidate candidateVicePresident2 = new Candidate();
        candidateVicePresident1.setName("Jasmine Saligan");
        candidateVicePresident2.setName("Jiu Tejome");

        // Check if fields are not blank or empty
        if (presidentCandidate.isEmpty() || presidentCandidate.isBlank() || vicePresidentCandidate.isEmpty() || vicePresidentCandidate.isBlank()) {
            Toast.makeText(MainActivity.this, "Fields should not be empty!", Toast.LENGTH_SHORT).show();
            return false;
        }
        else {

            // President
            if (presidentCandidate.equalsIgnoreCase(candidatePresident1.getName())) {
                president = presidentCandidate;
                Candidate.getPresident().setName(candidatePresident1.getName());
                chosenPresidentPhoto = R.drawable.pres1;
            }
            else if (presidentCandidate.equalsIgnoreCase(candidatePresident2.getName())) {
                president = presidentCandidate;
                Candidate.getPresident().setName(candidatePresident2.getName());
                chosenPresidentPhoto = R.drawable.pres2;
            }
            else {
                Toast.makeText(MainActivity.this, "Invalid President Candidate!", Toast.LENGTH_SHORT).show();
                return false;
            }

            // Vice President
            if (vicePresidentCandidate.equalsIgnoreCase(candidateVicePresident1.getName())) {
                vicePresident = vicePresidentCandidate;
                Candidate.getVicePresident().setName(candidateVicePresident1.getName());
                chosenVicePresidentPhoto = R.drawable.vp1;
            }
            else if (vicePresidentCandidate.equalsIgnoreCase(candidateVicePresident2.getName())) {
                vicePresident = vicePresidentCandidate;
                Candidate.getVicePresident().setName(candidateVicePresident2.getName());
                chosenVicePresidentPhoto = R.drawable.vp2;
            }
            else {
                Toast.makeText(MainActivity.this, "Invalid Vice President Candidate!", Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        return true;
    }
}