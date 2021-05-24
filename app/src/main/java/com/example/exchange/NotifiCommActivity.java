package com.example.exchange;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NotifiCommActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifi_comment);
        Button homeBtn = (Button) findViewById(R.id.home);
        Button commentBoxBtn = (Button) findViewById(R.id.msgBox);

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NotifiCommActivity.this,
                        MainActivity.class));


            }
        });

        commentBoxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NotifiCommActivity.this,
                        NotifiMsgActivity.class));

            }
        });


    }


}
