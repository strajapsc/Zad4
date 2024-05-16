package com.example.zad4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText prvi;
    private EditText drugi;
    private EditText rez;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prvi = (EditText) findViewById(R.id.editTextNumber);
        drugi = (EditText) findViewById(R.id.editTextNumber1);
        rez = (EditText) findViewById(R.id.editTextNumber2);
    }
    public void saberi(View view){
        double pr = Double.parseDouble(prvi.getText().toString());
        double dr = Double.parseDouble(drugi.getText().toString());
        rez.setText(String.valueOf(pr+dr));
    }
}