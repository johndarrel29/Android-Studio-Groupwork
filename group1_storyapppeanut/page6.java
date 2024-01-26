package com.example.group1_storyapppeanut;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page6);
    }


    public void next(View view){

        PageTurn.nextPage(this, page7.class);

    }

    public void back5(View view){
        //PageTurn.backPage(this, page5.class);

        getOnBackPressedDispatcher().onBackPressed();

    }



}
