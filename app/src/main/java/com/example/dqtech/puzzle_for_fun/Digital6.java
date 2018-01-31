package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ADMIN on 1/25/2018.
 */

public class Digital6 extends AppCompatActivity {
    Button b17;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital6);
        b17= (Button) findViewById(R.id.n16);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(Digital6.this,Digital7.class);
                startActivity(b);
            }
        });
    }
}
