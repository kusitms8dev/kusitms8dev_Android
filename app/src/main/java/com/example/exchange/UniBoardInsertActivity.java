package com.example.exchange;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UniBoardInsertActivity extends AppCompatActivity {
    private TextView tv_outPut;
    public static String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uniboard_insert);

        tv_outPut = (TextView) findViewById(R.id.tv_outPut);


        Button backBtn = (Button) findViewById(R.id.back);
        Button insertBtn = (Button)findViewById(R.id.postSave);

        final EditText postContent = (EditText)findViewById(R.id.postCntn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                text = postContent.getText().toString();
                String url = "http://104.154.113.3/chk/";

                // AsyncTask를 통해 HttpURLConnection 수행.
                NetworkTask networkTask = new NetworkTask(url, null);

                String responce = (networkTask.execute()).toString();

                //Toast.makeText(UniBoardInsertActivity.this, content, Toast.LENGTH_SHORT).show();
                Toast.makeText(UniBoardInsertActivity.this, responce, Toast.LENGTH_LONG).show();


            }
        });


    }

    public class NetworkTask extends AsyncTask<Void, Void, String> {
        private String url;
        private ContentValues values;
        public NetworkTask(String url, ContentValues values) {
            this.url = url;
            this.values = values;
        } @Override protected String doInBackground(Void... params) {
        String result;
        // 요청 결과를 저장할 변수.
        RequestHttpURLConnectionBadWords requestHttpURLConnection = new RequestHttpURLConnectionBadWords();
        result = requestHttpURLConnection.request(url, values);

        // 해당 URL로 부터 결과물을 얻어온다.
        return result;
    }
    @Override protected void onPostExecute(String s) {
        super.onPostExecute(s);
        //doInBackground()로 부터 리턴된 값이 onPostExecute()의 매개변수로 넘어오므로 s를 출력한다.
        tv_outPut.setText(s);
        //Toast.makeText(UniBoardInsertActivity.this, tv_outPut.toString(), Toast.LENGTH_LONG).show();


    }
}}

