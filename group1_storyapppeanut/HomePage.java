package com.example.group1_storyapppeanut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    private Button startbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        startbutton = (Button) findViewById(R.id.startbutton);
        startbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onToPage1();
            } // i shall name this method nalang as onToPage1.
        });
    }

    public void onToPage1() {
        Intent intent = new Intent(this, page1.class); // kindly edit nalang the java class to page1. thank yewww
        startActivity(intent);
    }

}