package com.example.educalabora;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class DwableAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwable_animation);

        ImageView img = (ImageView) findViewById(R.id.imageViewLoading);
        Animatable animacao = (AnimationDrawable) img.getDrawable();
        animacao.start();
    }
}