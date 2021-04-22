package com.example.vilimirita;

import android.annotation.SuppressLint;
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

public class StartGameThree extends AppCompatActivity {

    int count = 0;

    TextView tv;
    TextView tv2;
    TextView tv3;
    TextView tv4;

    Button back;
    Button color1;
    Button color2;
    Button color3;
    Button color4;
    Button color5;
    Button color6;

    Button game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_three);

        tv = findViewById(R.id.textView2);
        tv2 = findViewById(R.id.textView3);
        tv3 = findViewById(R.id.textView5);
        tv4 = findViewById(R.id.textView7);
        color1 = findViewById(R.id.c1);
        color2 = findViewById(R.id.c2);
        color3 = findViewById(R.id.c3);
        color4 = findViewById(R.id.c4);
        color5 = findViewById(R.id.c5);
        color6 = findViewById(R.id.c6);

        game = findViewById(R.id.button);

        back = findViewById(R.id.w0);

        //начальная фаза кнопок
        setEnable(false);
         //обработка кнопок
        color1.setOnClickListener(oс);
        color2.setOnClickListener(oс);
        color3.setOnClickListener(oс);
        color4.setOnClickListener(oс);
        color5.setOnClickListener(oс);
        color6.setOnClickListener(oс);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void setEnable(boolean i){
        color1.setEnabled(i);
        color2.setEnabled(i);
        color3.setEnabled(i);
        color4.setEnabled(i);
        color5.setEnabled(i);
        color6.setEnabled(i);
    }

    String[] r = {"красный","оранжевый","желтый","зеленый","синий","фиолетовый"};

    View.OnClickListener oс = new View.OnClickListener() {
        @SuppressLint("SetTextI18n")
        @RequiresApi(api = Build.VERSION_CODES.N)
        public void onClick(View view) {

            // узнаем какое слово было выведено на экран
            int index = (Arrays.asList(r).indexOf(tv.getText())) + 1;

            Button btn = findViewById(view.getId());

            // если слово на экране соответствует тексту на нажатой кнопке...
            if (String.valueOf(index).contentEquals(btn.getText())) {
                // выборка нового слово
                randomSelectWord();
                count++;
                tv2.setText("ПРАВИЛЬНО");
                tv2.setTextColor(getResources().getColor(R.color.green));
                tv4.setText("счет: " + count);
            }
            else{
                tv2.setText("НЕПРАВИЛЬНО");
                tv2.setTextColor(getResources().getColor(R.color.red));
                count--;
                tv4.setText("счет: " + count);
            }
        }
    };

    private void randomSelectWord() {
        tv.setText(r[(int) (Math.random() * r.length)]);
    }
    //кнопка выхода на главный экран
    public void back(View view) {
        Intent a = new Intent(StartGameThree.this , MainActivity.class);
        startActivity(a);
        finish();
    }
    //старт игры
    public void game(View view){
        setEnable(false);

        game.setEnabled(false);

        color1.setBackgroundColor(getResources().getColor(R.color.red));
        color2.setBackgroundColor(getResources().getColor(R.color.orange));
        color3.setBackgroundColor(getResources().getColor(R.color.yellow));
        color4.setBackgroundColor(getResources().getColor(R.color.green));
        color5.setBackgroundColor(getResources().getColor(R.color.blue));
        color6.setBackgroundColor(getResources().getColor(R.color.purple));

        color1.setTextColor(getResources().getColor(R.color.red));
        color2.setTextColor(getResources().getColor(R.color.orange));
        color3.setTextColor(getResources().getColor(R.color.yellow));
        color4.setTextColor(getResources().getColor(R.color.green));
        color5.setTextColor(getResources().getColor(R.color.blue));
        color6.setTextColor(getResources().getColor(R.color.purple));

        count = 0;
        tv4.setText("счет :" + count);
          randomSelectWord();

          //создание таймера
        new CountDownTimer(20000 , 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tv3.setText("таймер : " + millisUntilFinished / 1000);
            }
            //конец таймера
            @Override
            public void onFinish() {
                setEnable(false);

                tv.setText("нажми \n start");
                game.setEnabled(true);
            }
        }.start();
    } //конец игры
}
