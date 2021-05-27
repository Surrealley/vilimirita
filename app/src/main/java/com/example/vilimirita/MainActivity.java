package com.example.vilimirita;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(oc);
        btn2.setOnClickListener(oc);
        btn3.setOnClickListener(oc);
    }

    View.OnClickListener oc = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          switch (v.getId()) {
              case R.id.btn1:
                  Intent a = new Intent(MainActivity.this , StartGameTwo.class);
                  startActivity(a);
                  finish();
                  break;
              case R.id.btn2:
                  Intent b = new Intent(MainActivity.this , StartGameThree.class);
                  startActivity(b);
                  finish();
                  break;
              case R.id.btn3:
                  Intent c = new Intent(MainActivity.this , StartGameFour.class);
                  startActivity(c);
                  finish();
                  break;
          }
        }
    };
}