package com.example.exchange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class UniBoardRecommActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uniboard_recomm);
        Button homeBtn = (Button) findViewById(R.id.home);
        Button uniboardMoreBtn = (Button) findViewById(R.id.uniBoardMore);
        Button uniboardMakeBtn = (Button) findViewById(R.id.uniBoardMake);

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UniBoardRecommActivity.this,
                        MainActivity.class));

            }
        });

        uniboardMoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UniBoardRecommActivity.this,
                        UniBoardActivity.class));

            }
        });

        uniboardMakeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UniBoardRecommActivity.this,
                        UniBoardMakeActivity.class));

            }
        });

    }
}

