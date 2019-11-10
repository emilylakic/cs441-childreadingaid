package com.example.myapplication.cs441_childreadingaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    Button backButton;
    Button the;
    Button to;
    Button and;
    Button he;
    Button you;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        backButton = (Button) findViewById(R.id.backButton);
        the = (Button) findViewById(R.id.the);
        to = (Button) findViewById(R.id.to);
        and = (Button) findViewById(R.id.and);
        he = (Button) findViewById(R.id.he);
        you = (Button) findViewById(R.id.you);

        backButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        the.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        to.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(ThirdActivity.this, FifthActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        and.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(ThirdActivity.this, SixthActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
