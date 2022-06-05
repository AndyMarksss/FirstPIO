package com.example.educalabora.Pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.educalabora.R;

public class page5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
    }
    /*ativar a activity que o botão irá abrir*/
    public void startexercicio7corretivaActivity (View view) {
        Intent startexercicio7corretiva = new Intent(this, com.example.educalabora.Exercicios.exercicio7_corretiva.class);
        startActivity(startexercicio7corretiva);
    }
    public void startexercicio8corretivaActivity (View view) {
        Intent exercicio8corretiva = new Intent(this, com.example.educalabora.Exercicios.exercicio8_corretiva.class);
        startActivity(exercicio8corretiva);
    }
}
