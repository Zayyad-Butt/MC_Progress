package com.example.fragmentpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        linearLayout=findViewById(R.id.linearLayout);

    }

    public void FragmentOne(View view) {
        FragmentOne fragment1 = new FragmentOne();
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.linearLayout, fragment1);
        transaction.commit();
    }

    public void FragmentTwo(View view) {
        FragmentTwo fragment2 = new FragmentTwo();
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.linearLayout, fragment2);
        transaction.commit();
    }
}