package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Eight extends AppCompatActivity {
    RadioButton r29,r30,r31,r32;
    RadioGroup rr8;
    Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        rr8= (RadioGroup) findViewById(R.id.r8);
        r29= (RadioButton) findViewById(R.id.ry29);
        r30= (RadioButton) findViewById(R.id.ry30);
        r31= (RadioButton) findViewById(R.id.ry31);
        r32= (RadioButton) findViewById(R.id.ry32);
        b9= (Button) findViewById(R.id.n8);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s=new Intent(Eight.this,Nine.class);
                startActivity(s);
            }
        });
    }
}
