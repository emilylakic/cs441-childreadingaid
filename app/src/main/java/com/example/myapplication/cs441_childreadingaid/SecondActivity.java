package com.example.myapplication.cs441_childreadingaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    Button backButton;
    Button list1;
    Button list2;
    Button list3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        backButton = (Button) findViewById(R.id.backButton);
        list1 = (Button) findViewById(R.id.list1);
        list2 = (Button) findViewById(R.id.list2);
        list3 = (Button) findViewById(R.id.list3);

        backButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        list1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        list2.setOnClickListener(new View.OnClickListener() {

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

        list3.setOnClickListener(new View.OnClickListener() {

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
