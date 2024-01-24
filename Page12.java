package com.example.page12_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page12 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page12);

        Button page12B = findViewById(R.id.page12B);

        Intent intentt = new Intent();

        page12B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentt.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                PageTurn.nextPage(Page12.this, Page13.class);
            }
        });



    }
}