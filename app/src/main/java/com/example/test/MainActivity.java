package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button glosari=(Button) findViewById(R.id.glosari);
        glosari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGlosari();
            }
        });
        Button basic=(Button) findViewById(R.id.basic);
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBasicOperations();
            }
        });
    }
    public  void openBasicOperations(){
        Intent intent=new Intent(this, basicmaths.class);
        startActivity(intent);
    }
    public void openGlosari(){
        Intent intent=new Intent(this, Glosari.class);
        startActivity(intent);
    }
}