package com.example.myapplication.cs441_childreadingaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button letsBegin;
    ImageButton aboutButton;
    ImageButton homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        letsBegin = (Button) findViewById(R.id.letsBegin);
        aboutButton = (ImageButton) findViewById(R.id.aboutButton);
        homeButton = (ImageButton) findViewById(R.id.homeButton);
        letsBegin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                startActivity(intent);
            }
        });
        aboutButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SixthActivity.class);

                startActivity(intent);
            }
        });
        homeButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                startActivity(intent);
            }
        });
    }
}
