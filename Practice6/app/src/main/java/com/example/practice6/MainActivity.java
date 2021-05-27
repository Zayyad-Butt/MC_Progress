package com.example.practice6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button addButton, viewButton;
    EditText editName,editAge;
    Switch isActive;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton=findViewById(R.id.button);
        viewButton=findViewById(R.id.button2);
        addButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Add Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        viewButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"View Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}