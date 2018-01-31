package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Fourth extends AppCompatActivity {
    RadioButton r13,r14,r15,r16;
    RadioGroup rr4;
    Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        rr4= (RadioGroup) findViewById(R.id.r4);
        r13= (RadioButton) findViewById(R.id.ry13);
        r14= (RadioButton) findViewById(R.id.ry14);
        r15= (RadioButton) findViewById(R.id.ry15);
        r16= (RadioButton) findViewById(R.id.ry16);
        b5= (Button) findViewById(R.id.n4);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o=new Intent(Fourth.this,Five.class);
                startActivity(o);
            }
        });
    }
}
