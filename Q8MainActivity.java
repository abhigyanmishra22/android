package com.example.q8;

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

        Button b1, b2;
        b1 = findViewById(R.id.actlc);
        b2 = findViewById(R.id.frglc);
        Intent i1, i2;
        i1= new Intent(MainActivity.this, ActLC.class);
        i2 = new Intent(MainActivity.this, FragLC.class);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(i1);
             }
         });
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(i2);
             }
         });
    }
}