package com.example.group1_storyapppeanut;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page1 extends AppCompatActivity {

    @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
       setContentView(R.layout.page1);

    }
    public void next2(View view){
        PageTurn.nextPage(this, page2.class);
    }

}
