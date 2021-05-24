package com.example.exchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guidePrepBtn = (Button)findViewById(R.id.guide_prep);
        Button guideChooseCountryBtn = (Button)findViewById(R.id.guide_choose_country);
        Button guideLangTestBtn = (Button)findViewById(R.id.guide_lang_test);

        Button uniBoardBtn = (Button) findViewById(R.id.uniBoard);
        Button innBoardBtn = (Button) findViewById(R.id.innBoard);
        Button revBoardBtn = (Button) findViewById(R.id.revBoard);

        Button notifyBtn = (Button)findViewById(R.id.notify);

        //가이드로 이동
        guidePrepBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        GuidePrepActivity.class)); //여기서부터 하면 됨 (20210521)

            }
        });
        guideChooseCountryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        GuideChooseCounActivity.class));

            }
        });
        guideLangTestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        GuideLangTestActivity.class));

            }
        });

        //게시판으로 이동
        uniBoardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        UniBoardRecommActivity.class));

            }
        });
        innBoardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        innBoardRecommActivity.class));

            }
        });
        revBoardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        RevBoardActivity.class));

            }
        });

        //알림 액티비티로 이동
        notifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        NotifiMsgActivity.class));

            }
        });

    }


}