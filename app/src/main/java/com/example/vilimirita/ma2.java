package com.example.vilimirita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ma2 extends AppCompatActivity {

    Button b3;
    Button s;
    Button o;

    TextView m1;
    TextView m2;

    Button k1;
    Button k2;
    Button k3;
    Button k4;
    Button k5;
    Button k6;
    Button k7;
    Button k8;
    Button k9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.am2);

        {
            b3 = findViewById(R.id.w0);
            s = findViewById(R.id.start);
            o = findViewById(R.id.over);

            m1 = findViewById(R.id.tv2);
            m2 = findViewById(R.id.tv3);

            k1 = findViewById(R.id.b1);
            k2 = findViewById(R.id.b2);
            k3 = findViewById(R.id.b3);
            k4 = findViewById(R.id.b4);
            k5 = findViewById(R.id.b5);
            k6 = findViewById(R.id.b6);
            k7 = findViewById(R.id.b7);
            k8 = findViewById(R.id.b8);
            k9 = findViewById(R.id.b9);
        }

        {
            k1.setOnClickListener(buttons);
            k2.setOnClickListener(buttons);
            k3.setOnClickListener(buttons);
            k4.setOnClickListener(buttons);
            k5.setOnClickListener(buttons);
            k6.setOnClickListener(buttons);
            k7.setOnClickListener(buttons);
            k8.setOnClickListener(buttons);
            k9.setOnClickListener(buttons);
        }

        {
            k1.setEnabled(false);
            k2.setEnabled(false);
            k3.setEnabled(false);
            k4.setEnabled(false);
            k5.setEnabled(false);
            k6.setEnabled(false);
            k7.setEnabled(false);
            k8.setEnabled(false);
            k9.setEnabled(false);

            o.setEnabled(false);
        } // выкл кнопок в начале

    }

    public int random() {
        String[] r = {"1","2","3","4","5","6","7","8","9"};
        int s = r.length;
        int a = 1;

        for (int i = 0; i < 1; i++) {
            a = (int) (1 + Math.random() * s);
        }
        return a;
    } //метод рандома

    public void back(View view) {
        Intent a = new Intent(ma2.this, MainActivity.class);
        startActivity(a);
        finish();
    } //переход на основное окно

    View.OnClickListener buttons = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.b1:
                     if(m1.getText().equals(k1.getText())) {
                         m2.setText("ПРАВИЛЬНО");
                         m2.setTextColor(getResources().getColor(R.color.green));
                         m1.setText(Integer.toString(random()));

                     }
                     else {
                         m2.setText("НЕПРАВИЛЬНО");
                         m2.setTextColor(getResources().getColor(R.color.red));
                     }
                    break;
                case R.id.b2:
                    if(m1.getText().equals(k2.getText())) {
                        m2.setText("ПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.green));
                        m1.setText(Integer.toString(random()));
                    }
                    else {
                        m2.setText("НЕПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.red));
                    }
                    break;
                case R.id.b3:
                    if(m1.getText().equals(k3.getText())) {
                        m2.setText("ПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.green));
                        m1.setText(Integer.toString(random()));
                    }
                    else {
                        m2.setText("НЕПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.red));
                    }
                    break;
                case R.id.b4:
                    if(m1.getText().equals(k4.getText())) {
                        m2.setText("ПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.green));
                        m1.setText(Integer.toString(random()));
                    }
                    else {
                        m2.setText("НЕПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.red));
                    }
                    break;
                case R.id.b5:
                    if(m1.getText().equals(k5.getText())) {
                        m2.setText("ПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.green));
                        m1.setText(Integer.toString(random()));
                    }
                    else {
                        m2.setText("НЕПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.red));
                    }
                    break;
                case R.id.b6:
                    if(m1.getText().equals(k6.getText())) {
                        m2.setText("ПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.green));
                        m1.setText(Integer.toString(random()));
                    }
                    else {
                        m2.setText("НЕПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.red));
                    }
                    break;
                case R.id.b7:
                    if(m1.getText().equals(k7.getText())) {
                        m2.setText("ПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.green));
                        m1.setText(Integer.toString(random()));
                    }
                    else {
                        m2.setText("НЕПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.red));
                    }
                    break;
                case R.id.b8:
                    if(m1.getText().equals(k8.getText())) {
                        m2.setText("ПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.green));
                        m1.setText(Integer.toString(random()));
                    }
                    else {
                        m2.setText("НЕПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.red));
                    }
                    break;
                case R.id.b9:
                    if(m1.getText().equals(k9.getText())) {
                        m2.setText("ПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.green));
                        m1.setText(Integer.toString(random()));
                    }
                    else {
                        m2.setText("НЕПРАВИЛЬНО");
                        m2.setTextColor(getResources().getColor(R.color.red));
                    }
                    break;

            }
        }
    }; //обработка кнопок для игры

    public void Start(View view) {
        k1.setEnabled(true);
        k2.setEnabled(true);
        k3.setEnabled(true);
        k4.setEnabled(true);
        k5.setEnabled(true);
        k6.setEnabled(true);
        k7.setEnabled(true);
        k8.setEnabled(true);
        k9.setEnabled(true);

        m1.setText(Integer.toString(random()));
        s.setEnabled(false);
        o.setEnabled(true);
    } //рандомизания экрана и вкл кнопок

    public void over(View view) {
        k1.setEnabled(false);
        k2.setEnabled(false);
        k3.setEnabled(false);
        k4.setEnabled(false);
        k5.setEnabled(false);
        k6.setEnabled(false);
        k7.setEnabled(false);
        k8.setEnabled(false);
        k9.setEnabled(false);

        m1.setText("нажми \n start");
        o.setEnabled(false);
        s.setEnabled(true);
    }
}