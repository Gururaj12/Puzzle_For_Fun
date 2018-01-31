package com.example.dqtech.puzzle_for_fun;

import android.annotation.SuppressLint;
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

public class IQ_Test_4 extends AppCompatActivity {

    Button testa4,testb4,testc4,testd4;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq__test_4);

        testa4= (Button) findViewById(R.id.test4a);
        testb4= (Button) findViewById(R.id.test4b);
        testc4= (Button) findViewById(R.id.test4c);
        testd4= (Button) findViewById(R.id.test4d);


        testa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4 = new Intent(IQ_Test_4.this, IQ_Test_5.class);
                Toast.makeText(IQ_Test_4.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                startActivity(i4);

            }
        });

        testb4.setOnClickListener(new View.OnClickListener() {
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

        testc4.setOnClickListener(new View.OnClickListener() {
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

        testd4.setOnClickListener(new View.OnClickListener() {
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
