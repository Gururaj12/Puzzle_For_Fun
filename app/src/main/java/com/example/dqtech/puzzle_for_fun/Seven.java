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

public class Seven extends AppCompatActivity {
    RadioButton r25,r26,r27,r28;
    RadioGroup rr7;
    Button b8;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        rr7= (RadioGroup) findViewById(R.id.r7);
        r25= (RadioButton) findViewById(R.id.ry25);
        r26= (RadioButton) findViewById(R.id.ry26);
        r27= (RadioButton) findViewById(R.id.ry27);
        r28= (RadioButton) findViewById(R.id.ry28);
        b8= (Button) findViewById(R.id.n7);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r=new Intent(Seven.this,Eight.class);
                startActivity(r);
            }
        });
    }
}
