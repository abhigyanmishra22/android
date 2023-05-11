package com.example.q11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WlcmUsr extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wlcm_usr);

        txt = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String user_name = intent.getStringExtra("USERNAME");
        txt.setText("Welcome, "+ user_name);
    }
    public void onBackPressed(){
        AlertDialog.Builder alertdialogue = new AlertDialog.Builder(WlcmUsr.this);
        alertdialogue.setTitle("Exit Window");
        alertdialogue.setMessage("Do you want to go back?");
        alertdialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        alertdialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }

        });
        alertdialogue.show();
    }
}