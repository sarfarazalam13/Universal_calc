package com.example.univcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dmart extends AppCompatActivity {
    EditText price1, wt1, price2, wt2;
    TextView res;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dmart);
        price1 = findViewById(R.id.price1);
        price2 = findViewById(R.id.price2);
        wt1 = findViewById(R.id.wt1);
        wt2 = findViewById(R.id.wt2);
        res = findViewById(R.id.result);
        calculate=findViewById(R.id.buttontext);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p1 = Integer.parseInt(price1.getText().toString());
                int w1 = Integer.parseInt(wt1.getText().toString());

                int p2 = Integer.parseInt(price2.getText().toString());
                int w2 = Integer.parseInt(wt2.getText().toString());
                double x = w1 / p1;
                double y = w2 / p2;

                if (x < y) {
                    res.setText("item1");
                } else if (x == y) {
                    res.setText("equal faida");
                } else {
                    res.setText("item 2");
                }
            }
        });
    }
}
