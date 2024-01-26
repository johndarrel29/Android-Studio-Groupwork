package com.example.group1_storyapppeanut;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page8);
    }

    public void next9(View view){

        PageTurn.nextPage(this, page9.class);

    }

    public void back7(View view){
        //PageTurn.backPage(this, page5.class);

        getOnBackPressedDispatcher().onBackPressed();

    }


}
