package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    EditText userreg,useremail,userpassword,confirmpswd,userphone,usercity;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        userreg= (EditText) findViewById(R.id.reguser);
        useremail= (EditText) findViewById(R.id.regemail);
        userpassword= (EditText) findViewById(R.id.regpassword);
        confirmpswd= (EditText) findViewById(R.id.regreenterpassword);
        userphone= (EditText) findViewById(R.id.regphonenumber);
        usercity= (EditText) findViewById(R.id.regcity);
        reg= (Button) findViewById(R.id.regbutton);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Registration.this, Login.class);
                startActivity(i);
            }
        });
    }
}
