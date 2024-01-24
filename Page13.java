package com.example.page12_14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page13);

        Button page13B = findViewById(R.id.page13B);

        page13B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PageTurn.nextPage(Page13.this, Page14.class);
            }
        });
    }
}