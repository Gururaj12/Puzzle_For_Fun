package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Numberseries extends AppCompatActivity {
Button numb1,numb2,numb3,numb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numberseries);
        numb1= (Button) findViewById(R.id.num1);
        numb2= (Button) findViewById(R.id.num2);
        numb3= (Button) findViewById(R.id.num3);
        numb4= (Button) findViewById(R.id.num4);
    }
}
