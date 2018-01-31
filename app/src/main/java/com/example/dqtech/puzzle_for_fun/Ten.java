package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Ten extends AppCompatActivity {
    RadioButton r37,r38,r39,r40;
    RadioGroup rr10;
    Button b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        rr10= (RadioGroup) findViewById(R.id.r10);
        r37= (RadioButton) findViewById(R.id.ry27);
        r38= (RadioButton) findViewById(R.id.ry38);
        r39= (RadioButton) findViewById(R.id.ry39);
        r40= (RadioButton) findViewById(R.id.ry40);
        b11= (Button) findViewById(R.id.n10);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u=new Intent(Ten.this,MainActivity.class);
                startActivity(u);
            }
        });
    }
}
