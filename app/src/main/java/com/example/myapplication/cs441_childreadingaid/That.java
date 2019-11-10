package com.example.myapplication.cs441_childreadingaid;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class That extends Activity implements TextToSpeech.OnInitListener {

    private TextToSpeech tts;
    private ImageButton btnSpeak;
    private TextView textView;
    Button backButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_that);

        backButton = (Button) findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called ThirdActivity with the following code:

                Intent intent = new Intent(That.this, List2.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        tts = new TextToSpeech(this, this);

        btnSpeak = (ImageButton) findViewById(R.id.btnSpeak);

        textView = (TextView) findViewById(R.id.textView);

        // button on click event
        btnSpeak.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                speakOut();
            }

        });
    }

    @Override
    public void onDestroy() {
        // Don't forget to shutdown tts!
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                btnSpeak.setEnabled(true);
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }

    private void speakOut() {

        String text = textView.getText().toString();

        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}