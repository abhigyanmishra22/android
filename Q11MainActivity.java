package com.example.q11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button) findViewById(R.id.login);
        EditText pass = (EditText) findViewById(R.id.pass);
        EditText user = (EditText) findViewById(R.id.user);
        Intent intent = new Intent(MainActivity.this, WlcmUsr.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_txt = user.getText().toString();
                intent.putExtra("USERNAME", user_txt);
                startActivity(intent);
            }
        });
    }

}