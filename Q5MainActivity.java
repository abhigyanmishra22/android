package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox Apple, Samsung, Google;
    Button Buy;
    android.widget.TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        Apple = (CheckBox) findViewById(R.id.apple);
        Samsung = (CheckBox) findViewById(R.id.samsung);
        Google = (CheckBox) findViewById(R.id.google);
        Buy = (Button) findViewById(R.id.buy);
        TextView = (android.widget.TextView) findViewById(R.id.textView);
        Buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int price = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items:");
                if (Apple.isChecked()) {
                    result.append("\nApple 120000Rs");
                    price += 120000;
                }
                if (Samsung.isChecked()) {
                    result.append("\nSamsung 78000Rs");
                    price += 78000;
                }
                if (Google.isChecked()) {
                    result.append("\nGoogle 70000Rs");
                    price += 70000;
                }
                result.append("\nTotal: " + price + "Rs");
                TextView.setText(result);
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}