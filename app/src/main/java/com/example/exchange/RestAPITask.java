package com.example.exchange;

import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestAPITask extends AsyncTask {
    // Variable to store url
    protected String mURL;

    // Constructor

    public RestAPITask(String url)
    { mURL = url; }

    // Background work
    @Override protected Object doInBackground(Object[] objects)
    { String result = null;
        try {
            // Open the connection
            URL url = new URL(mURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST"); InputStream is = conn.getInputStream();
            // Get the stream
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF_8"));
            String line; while ((line = reader.readLine()) != null) { builder.append(line); }

            // Set the result
            result = builder.toString();
        } catch (Exception e) {
            // Error calling the rest api
            Log.e("REST_API", "POST method failed: " + e.getMessage());
            e.printStackTrace();
        } return null;
    }
}

