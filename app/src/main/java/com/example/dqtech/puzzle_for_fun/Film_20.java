package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Film_20 extends AppCompatActivity {
    TextView film20tv;
    Button film20a,film20b,film20c,film20d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_20);

        film20tv = (TextView) findViewById(R.id.film20tv);
        film20a = (Button) findViewById(R.id.film20a);
        film20b = (Button) findViewById(R.id.film20b);
        film20c = (Button) findViewById(R.id.film20c);
        film20d = (Button) findViewById(R.id.film20d);



        film20a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film20b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film20c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film20d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
