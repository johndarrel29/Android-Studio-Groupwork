package com.example.group1_storyapppeanut;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
    }

    public void next3(View view){
        PageTurn.nextPage(this, page3.class);
    }

    public void back1(View view){
        getOnBackPressedDispatcher().onBackPressed();

    }

}