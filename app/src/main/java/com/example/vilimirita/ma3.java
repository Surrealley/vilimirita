package com.example.vilimirita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ma3 extends AppCompatActivity {

    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.am3);

        b4 = findViewById(R.id.w0);

        b4.setOnClickListener(oc3);
    }
    View.OnClickListener oc3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.w0:
                    Intent a = new Intent(ma3.this , MainActivity.class);
                    startActivity(a);
                    finish();
                    break;
            }
        }
    };
}
