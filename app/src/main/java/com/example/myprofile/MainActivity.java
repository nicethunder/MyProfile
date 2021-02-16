package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    private Toolbar mytoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytoolbar = (Toolbar) findViewById(R.id.mytoolbar);
        setSupportActionBar(mytoolbar);
    }
}