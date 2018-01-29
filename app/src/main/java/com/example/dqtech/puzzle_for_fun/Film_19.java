package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Film_19 extends AppCompatActivity {


    TextView film19tv;
    Button film19a,film19b,film19c,film19d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_19);

        film19tv = (TextView) findViewById(R.id.film19tv);
        film19a = (Button) findViewById(R.id.film19a);
        film19b = (Button) findViewById(R.id.film19b);
        film19c = (Button) findViewById(R.id.film19c);
        film19d = (Button) findViewById(R.id.film19d);


        film19a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film19b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film19c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        film19d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}
