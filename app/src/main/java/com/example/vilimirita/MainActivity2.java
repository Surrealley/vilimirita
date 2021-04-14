package com.example.vilimirita;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {

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
        setContentView(R.layout.activity_main2);

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
            key1.setOnClickListener(oс);
            key2.setOnClickListener(oс);
            key3.setOnClickListener(oс);
            key4.setOnClickListener(oс);
            key5.setOnClickListener(oс);
            key6.setOnClickListener(oс);
            key7.setOnClickListener(oс);
            key8.setOnClickListener(oс);
            key9.setOnClickListener(oс);
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
        Intent a = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(a);
        finish();
    } //переход на основное окно


    private void correctAnswer()
    {
        monitor2.setText("ПРАВИЛЬНО");
        monitor2.setTextColor(getResources().getColor(R.color.green));
        count++;
        monitor4.setText("счет: " + count);
        monitor.setText(Integer.toString(random()));
    }//правильный ответ

    private void wrongAnswer()
    {
        monitor2.setText("НЕПРАВИЛЬНО");
        monitor2.setTextColor(getResources().getColor(R.color.red));
        count--;
        monitor4.setText("счет: " + count);
    } //неправильный ответ

    View.OnClickListener oс = new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.N)
        public void onClick(View view) {
            String[] r = {"1","2","3","4","5","6","7","8","9"};
            // узнаем какое слово было выведено на экран
            int index = (Arrays.asList(r).indexOf(monitor.getText())) + 1;

            Button btn = findViewById(view.getId());
            // если слово на экране НЕ соответствует тексту на нажатой кнопке...
            if (String.valueOf(index) != btn.getText()){
               wrongAnswer();

            }

            // если слово на экране соответствует тексту на нажатой кнопке...
            if (String.valueOf(index).contentEquals(btn.getText())) {
                correctAnswer();
            }
        }
    };

    public void start(View view) {
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

                count = 0;

                monitor.setText("нажми \n start");
                start.setEnabled(true);
            }
        }.start();
    } //активация таймера и игры

}