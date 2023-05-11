package com.example.q10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                //i.setType("Text/plain");
                //i.putExtra(Intent.EXTRA_SUBJECT, "Q10");
               // i.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                startActivity(Intent.createChooser(i, "Select App"));
            }
        });
    }

}