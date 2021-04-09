package com.example.vilimirita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.w1);
        b2 = findViewById(R.id.w2);

        b1.setOnClickListener(oc);
        b2.setOnClickListener(oc);
    }

    View.OnClickListener oc = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          switch (v.getId()) {
              case R.id.w1:
                  Intent a = new Intent(MainActivity.this , ma2.class);
                  startActivity(a);
                  finish();
                  break;
              case R.id.w2:
                  Intent b = new Intent(MainActivity.this , ma3.class);
                  startActivity(b);
                  finish();
                  break;
          }
        }
    };
}