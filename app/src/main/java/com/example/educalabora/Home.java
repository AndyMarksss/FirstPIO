package com.example.educalabora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    /*ativar a class*/
    public void startHomeActivity (View view) {
        Intent Home = new Intent(this, Home.class);
        startActivity(Home);
    }
    /*ativar a activity que o botão irá abrir*/
    public void startpage1Activity (View view) {
        Intent page1 = new Intent(this, com.example.educalabora.Pages.page1.class);
        startActivity(page1);
    }
    public void startpage2Activity (View view) {
        Intent page2 = new Intent(this, com.example.educalabora.Pages.page2.class);
        startActivity(page2);
    }
    public void startpage3Activity (View view) {
        Intent page3 = new Intent(this, com.example.educalabora.Pages.page3.class);
        startActivity(page3);
    }
    public void startpage4Activity (View view) {
        Intent page4 = new Intent(this, com.example.educalabora.Pages.page4.class);
        startActivity(page4);
    }
    public void startpage5Activity (View view) {
        Intent page5 = new Intent(this, com.example.educalabora.Pages.page5.class);
        startActivity(page5);
    }
}