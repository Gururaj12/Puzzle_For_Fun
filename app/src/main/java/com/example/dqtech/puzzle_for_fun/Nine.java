package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Nine extends AppCompatActivity {
    RadioButton r33,r34,r35,r36;
    RadioGroup rr9;
    Button b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        rr9= (RadioGroup) findViewById(R.id.r9);
        r33= (RadioButton) findViewById(R.id.ry33);
        r34= (RadioButton) findViewById(R.id.ry34);
        r35= (RadioButton) findViewById(R.id.ry35);
        r36= (RadioButton) findViewById(R.id.ry36);
        b10= (Button) findViewById(R.id.n9);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(Nine.this,Ten.class);
                startActivity(t);
            }
        });
    }
}
