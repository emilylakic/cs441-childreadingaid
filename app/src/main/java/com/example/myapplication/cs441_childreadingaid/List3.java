package com.example.myapplication.cs441_childreadingaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class List3 extends AppCompatActivity {

    Button backButton;
    Button was;
    Button said;
    Button his;
    Button that;
    Button she;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3);
        backButton = (Button) findViewById(R.id.backButton);
        nextButton = (Button) findViewById(R.id.nextButton);
        was = (Button) findViewById(R.id.was);
        said = (Button) findViewById(R.id.said);
        his = (Button) findViewById(R.id.his);
        that = (Button) findViewById(R.id.that);
        she = (Button) findViewById(R.id.she);

        backButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List3.this, SecondActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List3.this, List4.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        was.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List3.this, Was.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        said.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List3.this, Said.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        his.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List3.this, His.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        that.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List3.this, That.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        she.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(List3.this, She.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
