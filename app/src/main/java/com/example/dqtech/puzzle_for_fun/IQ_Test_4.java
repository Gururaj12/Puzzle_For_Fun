package com.example.dqtech.puzzle_for_fun;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IQ_Test_4 extends AppCompatActivity {

    TextView teste;
    Button b4;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq__test_4);

        teste= (Button) findViewById(R.id.test4e);
        b4= (Button) findViewById(R.id.test4b);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(IQ_Test_4.this, IQ_Test_5.class);
                Toast.makeText(IQ_Test_4.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                startActivity(i);

            }
        });



    }
}
