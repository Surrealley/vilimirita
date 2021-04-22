package com.example.vilimirita;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class StartGameTwo extends AppCompatActivity {

    Button btn3;
    Button start;

    int count = 0;

    TextView tvInsert;
    TextView tvResult;
    TextView tvTimer;
    TextView tvCounter;

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
        setContentView(R.layout.game_two);

        btn3 = findViewById(R.id.w0);
        start = findViewById(R.id.start);

        tvInsert = findViewById(R.id.tv2);
        tvResult = findViewById(R.id.tv3);
        tvTimer = findViewById(R.id.tv4);
        tvCounter = findViewById(R.id.textView4);

        key1 = findViewById(R.id.b1);
        key2 = findViewById(R.id.b2);
        key3 = findViewById(R.id.b3);
        key4 = findViewById(R.id.b4);
        key5 = findViewById(R.id.b5);
        key6 = findViewById(R.id.b6);
        key7 = findViewById(R.id.b7);
        key8 = findViewById(R.id.b8);
        key9 = findViewById(R.id.b9);

        key1.setOnClickListener(oс);
        key2.setOnClickListener(oс);
        key3.setOnClickListener(oс);
        key4.setOnClickListener(oс);
        key5.setOnClickListener(oс);
        key6.setOnClickListener(oс);
        key7.setOnClickListener(oс);
        key8.setOnClickListener(oс);
        key9.setOnClickListener(oс);

        // начальная фаза бъектов
        setEnable(false);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void setEnable(boolean i){
        key1.setEnabled(i);
        key2.setEnabled(i);
        key3.setEnabled(i);
        key4.setEnabled(i);
        key5.setEnabled(i);
        key6.setEnabled(i);
        key7.setEnabled(i);
        key8.setEnabled(i);
        key9.setEnabled(i);
    }

    //метод рандома
    public int random() {
        String[] r = {"1","2","3","4","5","6","7","8","9"};
        int s = r.length;
        int a = 1;

        for (int i = 0; i < 1; i++) {
            a = (int) (1 + Math.random() * s);
        }
        return a;
    }

    //переход на основное окно
    public void back(View view) {
        Intent a = new Intent(StartGameTwo.this, MainActivity.class);
        startActivity(a);
        finish();
    }

    //правильный ответ
    private void correctAnswer() {
        count++;
        tvResult.setText("ПРАВИЛЬНО");
        tvResult.setTextColor(getResources().getColor(R.color.green));
        Log.d("QWERTY", String.valueOf(count));
        tvCounter.setText("счет: " + count);
        tvInsert.setText(Integer.toString(random()));
    }

    //неправильный ответ
    private void wrongAnswer() {
        tvResult.setText("НЕПРАВИЛЬНО");
        tvResult.setTextColor(getResources().getColor(R.color.red));
        count--;
        tvCounter.setText("счет: " + count);
    }

    View.OnClickListener oс = new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.N)
        public void onClick(View view) {
            String[] r = {"1","2","3","4","5","6","7","8","9"};
            // узнаем какое слово было выведено на экран
            int index = (Arrays.asList(r).indexOf(tvInsert.getText())) + 1;

            Button btn = findViewById(view.getId());
            // если слово на экране соответствует тексту на нажатой кнопке...
            if (String.valueOf(index).contentEquals(btn.getText())) {
                correctAnswer();
            }
            // если слово на экране НЕ соответствует тексту на нажатой кнопке...
            else
            {
                wrongAnswer();
            }
        }
    };

    //старт  игры
    public void start(View view) {
        setEnable(true);

        tvCounter.setText("счет: " + count);

        tvInsert.setText(Integer.toString(random()));
        start.setEnabled(false);

        //создание таймера
        new CountDownTimer(20000 , 1000) {
            //активация таймера и игры
            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("таймер: " + millisUntilFinished / 1000);
            }

            //конец таймера
            @Override
            public void onFinish() {
                setEnable(false);

                count = 0;

                tvInsert.setText("нажми \n start");
                start.setEnabled(true);
            }
        }.start();
    }

}