package com.example.swapnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Swap(View v){
        EditText e1,e2;
        e1=(EditText)findViewById(R.id.txt1);
        e2=(EditText) findViewById(R.id.txt2);
        String str=e1.getText().toString();
        String str2=e2.getText().toString();
        String str3=str;
        str=str2;
        str2=str3;
        e1.setText(str);
        e2.setText(str2);
    }

}