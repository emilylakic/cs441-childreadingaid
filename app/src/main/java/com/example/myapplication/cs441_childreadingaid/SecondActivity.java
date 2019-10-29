package com.example.myapplication.cs441_childreadingaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    Button abcs;
    Button cartoonClips;
    Button sightWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        abcs = (Button) findViewById(R.id.abcs);
        cartoonClips = (Button) findViewById(R.id.cartoonClips);
        sightWords = (Button) findViewById(R.id.sightWords);

        abcs.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        cartoonClips.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(SecondActivity.this, FourthActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        sightWords.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(SecondActivity.this, FifthActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
