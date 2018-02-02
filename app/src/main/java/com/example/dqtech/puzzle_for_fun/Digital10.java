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

public class Digital10 extends AppCompatActivity {
     Button b21;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digital10);
        b21= (Button) findViewById(R.id.n20);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(Digital10.this,Home.class);
                startActivity(f);
                ///hgff
            }
        });
    }
}
