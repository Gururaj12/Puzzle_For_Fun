package com.example.dqtech.puzzle_for_fun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IQ_Test_1 extends AppCompatActivity implements View.OnClickListener {

    Button brook,creek,lake,stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iq__test_1);
        brook= (Button) findViewById(R.id.brok);
        creek= (Button) findViewById(R.id.test1b);
        lake= (Button) findViewById(R.id.test1c);
        stream= (Button) findViewById(R.id.test1d);

        brook.setOnClickListener(this);
        creek.setOnClickListener(this);
        lake.setOnClickListener(this);
        stream.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.brok:
               showTastyToast();
                break;

            case R.id.test1b:
                 showTastyToast();
                break;
            case R.id.test1c:
                showTastyToast();
                break;
            case R.id.test1d:
                showTastyToast();
                break;

        }

    }
    public void showTastyToast() {
        Toast newToast = Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG);
        newToast.setGravity(Gravity.CENTER, 0, 0);
        LayoutInflater inflater = getLayoutInflater();
        View tastyToast = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.tastyLayout));
        TextView toastText = (TextView) tastyToast.findViewById(R.id.textView1);
        newToast.setView(tastyToast);
        newToast.show();
    }
}
