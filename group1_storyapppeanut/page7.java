package com.example.group1_storyapppeanut;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page7);
    }

    public void next8(View view){

        PageTurn.nextPage(this, page8.class);

    }

    public void back6(View view){
        //PageTurn.backPage(this, page5.class);

        getOnBackPressedDispatcher().onBackPressed();

    }


}
