package com.example.vilimirita;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

public class ma3 extends AppCompatActivity {

    Button b4;
    Button k1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.am3);

        k1 = findViewById(R.id.button2);

        b4 = findViewById(R.id.w0);

    }
    View.OnClickListener oc3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
            }
        }
    };

    public void back(View view) {
        Intent a = new Intent(ma3.this , MainActivity.class);
        startActivity(a);
        finish();
    }

}
