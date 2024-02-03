package com.example.vote;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {
    private ImageView presImage;
    private ImageView vPresImage;
    private TextView presName;
    private TextView vPresName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String resultPres = getIntent().getStringExtra("president_name");
        String resultVicePres = getIntent().getStringExtra("vice_president_name");
        int resultPresImage = getIntent().getIntExtra("president_image", 0);
        int resultVicePresImage = getIntent().getIntExtra("vice_president_image", 0);

        presImage = findViewById(R.id.imageView2);
        vPresImage = findViewById(R.id.imageView3);
        presName = findViewById(R.id.textView4);
        vPresName = findViewById(R.id.textView7);

        presName.setText(resultPres);
        vPresName.setText(resultVicePres);
        presImage.setImageResource(resultPresImage);
        vPresImage.setImageResource(resultVicePresImage);
    }
}
