package com.example.mc01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton =  findViewById(R.id.button2);
        text = findViewById(R.id.textView);

    }
    public void displayMessage(View view){
        text.setText("You are logged in successfully");
    }
}