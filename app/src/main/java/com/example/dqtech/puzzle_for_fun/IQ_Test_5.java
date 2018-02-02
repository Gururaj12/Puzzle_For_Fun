package com.example.dqtech.puzzle_for_fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IQ_Test_5 extends AppCompatActivity {

    Button testa5,testb5,testc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq__test_5);

        testa5= (Button) findViewById(R.id.test5a);
        testb5= (Button) findViewById(R.id.test5b);
        testc5= (Button) findViewById(R.id.test5c);


        testa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
                newToast.setGravity(Gravity.CENTER, 0, 0);
                LayoutInflater inflater = getLayoutInflater();
                View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
                TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
                newToast.setView(tastyToast);
                newToast.show();

            }
        });

        testb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intttttt=new Intent(IQ_Test_5.this,IQ_Test_6.class);
                Toast.makeText(IQ_Test_5.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                startActivity(intttttt);

            }
        });

        testc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
                newToast.setGravity(Gravity.CENTER, 0, 0);
                LayoutInflater inflater = getLayoutInflater();
                View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
                TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
                newToast.setView(tastyToast);
                newToast.show();

            }
        });


    }
}
