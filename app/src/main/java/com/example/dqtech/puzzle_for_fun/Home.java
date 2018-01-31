package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button pic,question,film,gk;
    //vb

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        pic= (Button) findViewById(R.id.fourpic);
        question= (Button) findViewById(R.id.iq);
        film= (Button) findViewById(R.id.film);
        gk= (Button) findViewById(R.id.gk);

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Home.this,Basic.class);
                startActivity(i);

            }
        });
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Home.this,IQ_Test_1.class);
                startActivity(intent);

            }
        });

        film.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent y=new Intent(Home.this,MainActivity.class);
                startActivity(y);

            }
        });
    }
}
