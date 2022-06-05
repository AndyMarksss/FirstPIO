package com.example.educalabora.Exercicios;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.educalabora.R;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class exercicio8_corretiva extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio8corretiva);
        ImageView img = (ImageView) findViewById(R.id.imageViewLoading);
        Animatable animacao = (AnimationDrawable) img.getDrawable();
        animacao.start();




        textView = findViewById(R.id.text_view);

        //tempo de início
        long duration = TimeUnit.SECONDS.toMillis(30);

        //iniciar o contador
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {
                //converte milissegundos para minutos e segundos
                String sDuration =
                        String.format(
                                Locale.ENGLISH,
                                "%02d",
                                TimeUnit.MILLISECONDS.toSeconds(l) -
                                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l))
                        );

                //converter string em text view
                textView.setText(sDuration);
            }

            @Override
            public void onFinish() {

                //aviso de fim
                Toast.makeText(getApplicationContext(),
                        "O tempo do exercícios acabou",Toast.LENGTH_LONG).show();

            }
        }.start();
    }
}