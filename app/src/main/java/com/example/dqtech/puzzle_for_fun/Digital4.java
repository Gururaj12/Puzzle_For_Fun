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

public class Digital4 extends AppCompatActivity {
    Button b15;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital4);
        b15= (Button) findViewById(R.id.n14);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z=new Intent(Digital4.this,Digital5.class);
                startActivity(z);
            }
        });

    }
}
