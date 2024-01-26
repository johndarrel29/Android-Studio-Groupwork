package com.example.group1_storyapppeanut;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page10);
    }

    public void next11(View view){

        PageTurn.nextPage(this, page11.class);

    }

    public void back9(View view){
        //PageTurn.backPage(this, page5.class);

        getOnBackPressedDispatcher().onBackPressed();

    }
}
