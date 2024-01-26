package com.example.group1_storyapppeanut;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);
    }

    public void next4(View view){
        PageTurn.nextPage(this, page4.class);
    }

    public void back2(View view){
        getOnBackPressedDispatcher().onBackPressed();
    }

}
