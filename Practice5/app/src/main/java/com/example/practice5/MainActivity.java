package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> friendList;
    ArrayAdapter<String>arrayAdapter;
    EditText textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.myListView);
        Button button=findViewById(R.id.button);
        textView=findViewById(R.id.editTextTextPersonName);

        friendList = new ArrayList<String>();


        friendList.add("Hammad");
        friendList.add("Zayyad");
        friendList.add("Muaaz");
        friendList.add("Ali");

        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friendList);
        listView.setAdapter(arrayAdapter);
    }
    public void addDataInList(View view)
    {
        friendList.add(textView.getText().toString());
        listView.setAdapter(arrayAdapter);
    }
}