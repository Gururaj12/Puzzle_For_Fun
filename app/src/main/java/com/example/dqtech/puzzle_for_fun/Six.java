package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Six extends AppCompatActivity {
    RadioButton r21,r22,r23,r24;
    RadioGroup rr6;
    Button b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        rr6= (RadioGroup) findViewById(R.id.r6);
        r21= (RadioButton) findViewById(R.id.ry21);
        r22= (RadioButton) findViewById(R.id.ry22);
        r23= (RadioButton) findViewById(R.id.ry23);
        r24= (RadioButton) findViewById(R.id.ry24);
        b7= (Button) findViewById(R.id.n6);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q=new Intent(Six.this,Seven.class);
                startActivity(q);
            }
        });
    }
}
