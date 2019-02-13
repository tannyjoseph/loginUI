package com.example.loginui;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relay1, relay2;

    Handler handler = new Handler();

    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            relay1.setVisibility(View.VISIBLE);
            relay2.setVisibility(View.VISIBLE);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relay1 = (RelativeLayout) findViewById(R.id.rellay1);
        relay2 = (RelativeLayout) findViewById(R.id.relLay2);

        handler.postDelayed(runnable, 3000);
    }
}
