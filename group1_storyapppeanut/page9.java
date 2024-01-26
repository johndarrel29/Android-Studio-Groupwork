package com.example.group1_storyapppeanut;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page9);
    }

    public void next10(View view){

        PageTurn.nextPage(this, page10.class);

    }

    public void back8(View view){
        //PageTurn.backPage(this, page5.class);

        getOnBackPressedDispatcher().onBackPressed();

    }

}
