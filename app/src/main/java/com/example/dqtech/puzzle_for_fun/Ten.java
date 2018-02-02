package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Ten extends AppCompatActivity {
    RadioButton r37,r38,r39,r40;
    RadioGroup rr10;
    Button b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        rr10= (RadioGroup) findViewById(R.id.r10);
        r37= (RadioButton) findViewById(R.id.ry37);
        r38= (RadioButton) findViewById(R.id.ry38);
        r39= (RadioButton) findViewById(R.id.ry39);
        r40= (RadioButton) findViewById(R.id.ry40);
        b11= (Button) findViewById(R.id.n10);
        rr10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.ry37:
                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry38:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry39:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ry40:
                        Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u=new Intent(Ten.this,MainActivity.class);
                startActivity(u);
            }
        });
    }
}
