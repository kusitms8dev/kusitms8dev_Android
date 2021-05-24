package com.example.exchange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class innBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.innboard);
        Button backBtn = (Button) findViewById(R.id.home);
        Button writeBtn = (Button) findViewById(R.id.write);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(innBoardActivity.this,
                        MainActivity.class));

            }
        });

        writeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(innBoardActivity.this,
                        innBoardInsertActivity.class));

            }
        });


    }


}