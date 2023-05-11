package com.example.q6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        final String str[] = {"Computer Science", "Electronics", "Mathematics"};
        final String name[] = {"Dr. Sujata Khatri", "Dr. Anurag Mishra", "Dr. Ratnesh Ranjan Saxena"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_dropdown_item_1line, str);
        ArrayAdapter arrayAdapter1 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, name);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arrayAdapter1, View view, int i, long l) {
                if(str[0].equals(spinner.getItemAtPosition(i).toString())){
                    txt = name[i];
                    Toast.makeText(arrayAdapter1.getContext(), txt, Toast.LENGTH_SHORT).show();
                }
                else if(str[1].equals(spinner.getItemAtPosition(i).toString())){
                    txt = name[i];
                    Toast.makeText(arrayAdapter1.getContext(), txt, Toast.LENGTH_SHORT).show();
                }
                else if(str[2].equals(spinner.getItemAtPosition(i).toString())){
                    txt = name[i];
                    Toast.makeText(arrayAdapter1.getContext(), txt, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}