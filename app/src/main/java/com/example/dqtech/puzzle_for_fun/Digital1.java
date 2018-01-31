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

public class Digital1 extends AppCompatActivity {
    Button b12;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digital1);
        b12= (Button) findViewById(R.id.n11);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w=new Intent(Digital1.this,Digital2.class);
                startActivity(w);
            }
        });
    }
}
