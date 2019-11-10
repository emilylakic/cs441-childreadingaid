package com.example.myapplication.cs441_childreadingaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class List5 extends AppCompatActivity {

    Button backButton;
    Button at;
    Button him;
    Button with;
    Button up;
    Button all;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list5);
        backButton = (Button) findViewById(R.id.backButton);
        nextButton = (Button) findViewById(R.id.nextButton);
        at = (Button) findViewById(R.id.at);
        him = (Button) findViewById(R.id.him);
        with = (Button) findViewById(R.id.with);
        up = (Button) findViewById(R.id.up);
        all = (Button) findViewById(R.id.all);

        backButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List5.this, SecondActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List5.this, List3.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        at.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List5.this, At.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        him.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List5.this, Him.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        with.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List5.this, With.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        up.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List5.this, Up.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        all.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List5.this, All.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
