package com.example.educalabora.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.educalabora.R;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }
        /*ativar a activity que o botão irá abrir*/
        public void startexercicio1preparatorioActivity (View view) {
            Intent exercicio1preparatorio = new Intent(this, com.example.educalabora.Exercicios.exercicio1_preparatorio.class);
            startActivity(exercicio1preparatorio);
        }
        public void startexercicio2preparatorioActivity (View view) {
            Intent exercicio2preparatorio = new Intent(this, com.example.educalabora.Exercicios.exercicio2_preparatorio.class);
            startActivity(exercicio2preparatorio);
        }
    }
