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

    Button btn3;
    Button start;

    int count = 0;

    TextView monitor;
    TextView monitor2;
    TextView monitor3;
    TextView monitor4;

    private Button key1;
    private Button key2;
    private Button key3;
    private Button key4;
    private Button key5;
    private Button key6;
    private Button key7;
    private Button key8;
    private Button key9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.am2);

        {
            btn3 = findViewById(R.id.w0);
            start = findViewById(R.id.start);

            monitor = findViewById(R.id.tv2);
            monitor2 = findViewById(R.id.tv3);
            monitor3 = findViewById(R.id.tv4);
            monitor4 = findViewById(R.id.textView4);

            key1 = findViewById(R.id.b1);
            key2 = findViewById(R.id.b2);
            key3 = findViewById(R.id.b3);
            key4 = findViewById(R.id.b4);
            key5 = findViewById(R.id.b5);
            key6 = findViewById(R.id.b6);
            key7 = findViewById(R.id.b7);
            key8 = findViewById(R.id.b8);
            key9 = findViewById(R.id.b9);
        }

        {
            key1.setOnClickListener(buttons);
            key2.setOnClickListener(buttons);
            key3.setOnClickListener(buttons);
            key4.setOnClickListener(buttons);
            key5.setOnClickListener(buttons);
            key6.setOnClickListener(buttons);
            key7.setOnClickListener(buttons);
            key8.setOnClickListener(buttons);
            key9.setOnClickListener(buttons);
        }

        {
            key1.setEnabled(false);
            key2.setEnabled(false);
            key3.setEnabled(false);
            key4.setEnabled(false);
            key5.setEnabled(false);
            key6.setEnabled(false);
            key7.setEnabled(false);
            key8.setEnabled(false);
            key9.setEnabled(false);

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

    private void correctAnswer()
    {
        monitor2.setText("ПРАВИЛЬНО");
        monitor2.setTextColor(getResources().getColor(R.color.green));
        monitor.setText(Integer.toString(random()));
        count++;
        monitor4.setText("счет :" + count);
    }//правильный ответ

    private void wrongAnswer()
    {
        monitor2.setText("НЕПРАВИЛЬНО");
        monitor2.setTextColor(getResources().getColor(R.color.red));
        count--;
    } //неправильный ответ

    View.OnClickListener buttons = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.b1:
                     if(monitor.getText().equals(key1.getText())) {
                         correctAnswer();
                     }
                     else {
                         wrongAnswer();
                     }
                    break;
                case R.id.b2:
                    if(monitor.getText().equals(key2.getText())) {
                        correctAnswer();
                    }
                    else {
                        wrongAnswer();
                    }
                    break;
                case R.id.b3:
                    if(monitor.getText().equals(key3.getText())) {
                       correctAnswer();
                    }
                    else {
                       wrongAnswer();
                    }
                    break;
                case R.id.b4:
                    if(monitor.getText().equals(key4.getText())) {
                        correctAnswer();
                    }
                    else {
                        wrongAnswer();
                    }
                    break;
                case R.id.b5:
                    if(monitor.getText().equals(key5.getText())) {
                       correctAnswer();
                    }
                    else {
                        wrongAnswer();
                    }
                    break;
                case R.id.b6:
                    if(monitor.getText().equals(key6.getText())) {
                        correctAnswer();
                    }
                    else {
                        wrongAnswer();
                    }
                    break;
                case R.id.b7:
                    if(monitor.getText().equals(key7.getText())) {
                        correctAnswer();
                    }
                    else {
                       wrongAnswer();
                    }
                    break;
                case R.id.b8:
                    if(monitor.getText().equals(key8.getText())) {
                       correctAnswer();
                    }
                    else {
                        wrongAnswer();
                    }
                    break;
                case R.id.b9:
                    if(monitor.getText().equals(key9.getText())) {
                        correctAnswer();
                    }
                    else {
                       wrongAnswer();
                    }
                    break;

            }
        }
    }; //обработка кнопок для игры

    public void Start(View view) {
        key1.setEnabled(true);
        key2.setEnabled(true);
        key3.setEnabled(true);
        key4.setEnabled(true);
        key5.setEnabled(true);
        key6.setEnabled(true);
        key7.setEnabled(true);
        key8.setEnabled(true);
        key9.setEnabled(true);

        monitor4.setText("счет :" + count);

        monitor.setText(Integer.toString(random()));
        start.setEnabled(false);


        new CountDownTimer(20000 , 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                //m3.setText((int) (millisUntilFinished / 1000));
                monitor3.setText("таймер : " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                key1.setEnabled(false);
                key2.setEnabled(false);
                key3.setEnabled(false);
                key4.setEnabled(false);
                key5.setEnabled(false);
                key6.setEnabled(false);
                key7.setEnabled(false);
                key8.setEnabled(false);
                key9.setEnabled(false);

                monitor.setText("нажми \n start");
                start.setEnabled(true);
            }
        }.start();
    } //активация таймера и игры

}