package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IQ_Test_2 extends AppCompatActivity {

    Button testa2,testb2,testc2,testd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq__test_2);

        testa2= (Button) findViewById(R.id.test2a);
        testb2= (Button) findViewById(R.id.test2b);
        testc2= (Button) findViewById(R.id.test2c);
        testd2= (Button) findViewById(R.id.test2d);


        testa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IQ_Test_2.this, IQ_Test_2.class);
                Toast.makeText(IQ_Test_2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

        testb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IQ_Test_2.this, IQ_Test_2.class);
                Toast.makeText(IQ_Test_2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

        testc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IQ_Test_2.this, IQ_Test_2.class);
                Toast.makeText(IQ_Test_2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

        testd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IQ_Test_2.this, IQ_Test_3.class);
                Toast.makeText(IQ_Test_2.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });


    }
}
