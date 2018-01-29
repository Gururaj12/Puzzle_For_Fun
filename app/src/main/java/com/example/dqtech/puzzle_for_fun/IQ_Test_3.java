package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IQ_Test_3 extends AppCompatActivity {

    Button testa3,testb3,testc3,testd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq__test_3);

        testa3= (Button) findViewById(R.id.test3a);
        testb3= (Button) findViewById(R.id.test3b);
        testc3= (Button) findViewById(R.id.test3c);
        testd3= (Button) findViewById(R.id.test3d);


        testa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IQ_Test_3.this, IQ_Test_3.class);
                Toast.makeText(IQ_Test_3.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

        testb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IQ_Test_3.this, IQ_Test_3.class);
                Toast.makeText(IQ_Test_3.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

        testc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IQ_Test_3.this, IQ_Test_3.class);
                Toast.makeText(IQ_Test_3.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });

        testd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IQ_Test_3.this, IQ_Test_4.class);
                Toast.makeText(IQ_Test_3.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });



    }
}
