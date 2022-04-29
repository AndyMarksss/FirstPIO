package com.example.educalabora;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class
SplashScreen extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        },2000);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(v -> {

            Intent page1=new Intent(getApplicationContext(),page1.class);
            startActivity(page1);

        });
    }
}
