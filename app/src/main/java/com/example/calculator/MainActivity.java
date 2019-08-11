package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Result;
    EditText n1,n2;
    Button Add, Sub, Mul, Div;
float r;
 float a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result=(TextView)findViewById(R.id.Result);

        n1=(EditText)findViewById(R.id.n1);
        n2=(EditText)findViewById(R.id.n2);

        Add=(Button)findViewById(R.id.Add);
        Sub=(Button)findViewById(R.id.Sub);
        Mul=(Button)findViewById(R.id.Mul);
        Div=(Button)findViewById(R.id.Div);

       Add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               a=Float.parseFloat(n1.getText().toString());
               b=Float.parseFloat(n2.getText().toString());
               r=a+b;
               Result.setText(String.valueOf(r));
           }

       });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Float.parseFloat(n1.getText().toString());
                b=Float.parseFloat(n2.getText().toString());
                r=a-b;

                Result.setText(String.valueOf(r));
            }

        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Float.parseFloat(n1.getText().toString());
                b=Float.parseFloat(n2.getText().toString());
                r=a*b;
                Result.setText(String.valueOf(r));
            }

        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Float.parseFloat(n1.getText().toString());
                b=Float.parseFloat(n2.getText().toString());
                r=a/b;
                Result.setText(String.valueOf(r));
            }

        });

    }

}
