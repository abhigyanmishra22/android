package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDatabaseHelper db = new MyDatabaseHelper(this);
        db.add_data("1", "Rashmi");
        Button signup;
        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText eid = (EditText) findViewById(R.id.id);
                EditText ename = (EditText) findViewById(R.id.name);
                db.add_data(eid.getText().toString(), ename.getText().toString());
            }
        });

        ArrayList<LoginRecord> record= db.fetchRecord();
        for(int i=0; i<record.size(); i++)
        {
            Log.d("Student" , "ID" + record.get(i).id + "Name" + record.get(i).name);
        }

        LoginRecord updateStudent=new LoginRecord();
        updateStudent.id= 2;
        updateStudent.name= "Sudha";
        db.updateRecord(updateStudent);

        db.deleteRecord(2);
    }
}