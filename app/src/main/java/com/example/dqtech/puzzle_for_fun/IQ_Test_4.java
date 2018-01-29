package com.example.dqtech.puzzle_for_fun;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

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



    }
}
