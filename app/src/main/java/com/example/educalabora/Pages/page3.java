package com.example.educalabora.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.educalabora.R;

public class page3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }
    /*ativar a activity que o botão irá abrir*/
    public void startexercicio3compensatorioActivity (View view) {
        Intent exercicio3compensatorio = new Intent(this, com.example.educalabora.Exercicios.exercicio3_compensatorio.class);
        startActivity(exercicio3compensatorio);
    }
    public void startexercicio4compensatorioActivity (View view) {
        Intent exercicio4compensatorio = new Intent(this, com.example.educalabora.Exercicios.exercicio4_compensatorio.class);
        startActivity(exercicio4compensatorio);
    }
}
