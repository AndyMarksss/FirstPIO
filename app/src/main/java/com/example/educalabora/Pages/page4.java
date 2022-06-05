package com.example.educalabora.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.educalabora.R;

public class page4 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

    }
    /*ativar a activity que o botão irá abrir*/
    public void startexercicio5relaxamentoActivity (View view) {
        Intent exercicio5relaxamento = new Intent(this, com.example.educalabora.Exercicios.exercicio5_relaxamento.class);
        startActivity(exercicio5relaxamento);
    }
    public void startexercicio6relaxamentoActivity (View view) {
        Intent exercicio6relaxamento = new Intent(this, com.example.educalabora.Exercicios.exercicio6_relaxamento.class);
        startActivity(exercicio6relaxamento);
    }
}