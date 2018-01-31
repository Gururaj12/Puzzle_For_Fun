package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by ADMIN on 1/30/2018.
 */

public class Second extends AppCompatActivity {
    RadioButton r5,r6,r7,r8;
    RadioGroup rr1;
    Button b3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        rr1= (RadioGroup) findViewById(R.id.r2);
        r5= (RadioButton) findViewById(R.id.ry5);
        r6= (RadioButton) findViewById(R.id.ry6);
        r7= (RadioButton) findViewById(R.id.ry7);
        r8= (RadioButton) findViewById(R.id.ry8);
        b3= (Button) findViewById(R.id.n2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(Second.this,Thrid.class);
                startActivity(m);
            }
        });
    }
}
