package com.example.tth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.q4.R;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        img = findViewById(R.id.imageView2);
        final String str[] = {"image1", "image2", "image3", "image4"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_dropdown_item_1line,str);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(str[0].equals(spinner.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.acer_wallpaper_01_5000x2814);
                }
                else if(str[1].equals(spinner.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.acer_wallpaper_02_5000x2813);
                }
                else if(str[2].equals(spinner.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.acer_wallpaper_03_5000x2814);
                }
                else if(str[3].equals(spinner.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.bckgrd);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}