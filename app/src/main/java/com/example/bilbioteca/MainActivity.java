package com.example.bilbioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progress;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress= (ProgressBar)findViewById(R.id.pb);
        button=(Button)findViewById(R.id.bt);

        progress.setVisibility(View.INVISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Task().execute();
            }
        });
    }



    class Task extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {

            progress.setVisibility(View.VISIBLE);

        }

        @Override
        protected String doInBackground(String... strings) {
            for (int i= 1 ; i <=10; i++);
            {
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            progress.setVisibility(View.INVISIBLE);
            Intent i= new Intent(getBaseContext(),github_act.class);
            startActivity(i);

        }

    }

}