package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Thrid extends AppCompatActivity {
    RadioButton r9,r10,r11,r12;
    RadioGroup rr3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
        rr3= (RadioGroup) findViewById(R.id.r3);
        r9= (RadioButton) findViewById(R.id.ry9);
        r10= (RadioButton) findViewById(R.id.ry10);
        r11= (RadioButton) findViewById(R.id.ry11);
        r12= (RadioButton) findViewById(R.id.ry12);
        b4= (Button) findViewById(R.id.n3);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Thrid.this,Fourth.class);
                startActivity(n);
            }
        });
    }
}
