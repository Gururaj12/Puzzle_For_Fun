package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Questionr1 extends AppCompatActivity {
    TextView question1tv;
    Button question1a,question1b,question1c,question1d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionr1);

        question1tv= (TextView) findViewById(R.id.question1tv);
        question1a= (Button) findViewById(R.id.question1a);
        question1b= (Button) findViewById(R.id.question1b);
        question1c= (Button) findViewById(R.id.question1c);
        question1d= (Button) findViewById(R.id.question1d);

        question1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(Questionr1.this,Questionr2.class);
                startActivity(intent);

                Toast.makeText(Questionr1.this, "wrong", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
