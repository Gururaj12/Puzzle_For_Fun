package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class IQ_Test_5 extends AppCompatActivity {

    Button testa5,testb5,testc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq__test_5);

        testa5= (Button) findViewById(R.id.test5a);
        testb5= (Button) findViewById(R.id.test5b);
        testc5= (Button) findViewById(R.id.test5c);


    }
}
