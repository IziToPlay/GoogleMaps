package com.example.taregooglemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imgBtnMolicentro;
    ImageButton imgBtnJockeyPlaza;
    ImageButton imgBtnMonumental;
    ImageButton imgBtnUpc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarBotones();
    }

    public void inicializarBotones(){
        imgBtnMolicentro = findViewById(R.id.imgBtnMolicentro);
        imgBtnJockeyPlaza = findViewById(R.id.imgBtnJockeyPlaza);
        imgBtnMonumental = findViewById(R.id.imgBtnMonumental);
        imgBtnUpc = findViewById(R.id.imgBtnUpc);

        imgBtnJockeyPlaza.setOnClickListener(view -> {
            irMapaOne();
        });
        imgBtnUpc.setOnClickListener(view -> {
            irMapaTwo();
        });
        imgBtnMonumental.setOnClickListener(view -> {
            irMapaThree();
        });
        imgBtnMolicentro.setOnClickListener(view -> {
            irMapaFour();
        });
    }

    public void irMapaOne(){
        Intent i = new Intent(this, map_one.class);
        startActivity(i);
    }
    public void irMapaTwo(){
        Intent i = new Intent(this, map_two.class);
        startActivity(i);
    }
    public void irMapaThree(){
        Intent i = new Intent(this, map_three.class);
        startActivity(i);
    }
    public void irMapaFour(){
        Intent i = new Intent(this, map_four.class);
        startActivity(i);
    }
}