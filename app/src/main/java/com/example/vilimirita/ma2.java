package com.example.vilimirita;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ma2 extends AppCompatActivity {

    Button b3;
    Button s;

    int count = 0;

    TextView m1;
    TextView m2;
    TextView m3;
    TextView m4;

    private Button k1;
    private Button k2;
    private Button k3;
    private Button k4;
    private Button k5;
    private Button k6;
    private Button k7;
    private Button k8;
    private Button k9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.am2);

        {
            b3 = findViewById(R.id.w0);
            s = findViewById(R.id.start);

            m1 = findViewById(R.id.tv2);
            m2 = findViewById(R.id.tv3);
            m3 = findViewById(R.id.tv4);
            m4 = findViewById(R.id.textView4);

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

        } // начальная фаза бъектов

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
                         count++;

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
                        count++;
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
                        count++;
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
                        count++;
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
                        count++;
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
                        count++;
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
                        count++;
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
                        count++;
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
                        count++;
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

        m4.setText("счет :" + count);

        m1.setText(Integer.toString(random()));
        s.setEnabled(false);


        new CountDownTimer(20000 , 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                //m3.setText((int) (millisUntilFinished / 1000));
                m3.setText("таймер : " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
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
                s.setEnabled(true);
            }
        }.start();
    } //активация игры

}