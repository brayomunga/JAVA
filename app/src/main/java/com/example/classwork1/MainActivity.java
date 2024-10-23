package com.example.classwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import dalvik.annotation.optimization.FastNative;

public class MainActivity extends AppCompatActivity {
    EditText ednum1;
    EditText ednum2;
    Button bnadd;
    TextView txtresults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ednum1=(EditText)findViewById(R.id.ednum1);
        ednum2=(EditText)findViewById(R.id.ednum2);
        bnadd=(Button)findViewById(R.id.bnadd);
        txtresults=(TextView) findViewById(R.id.txtresults);
       bnadd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double num1=Double.parseDouble(ednum1.getText().toString());
               double num2=Double.parseDouble(ednum2.getText().toString());
               double sum=num1+num2;
               txtresults.setText(Double.toString(sum));
           }
       });
    }

}