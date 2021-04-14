package com.example.vilimirita;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ma3 extends AppCompatActivity {

    TextView t1;
    TextView t2;

    Button b4;
    Button c1;
    Button c2;
    Button c3;
    Button c4;
    Button c5;
    Button c6;

    Button g1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.am3);

        {
        t1 = findViewById(R.id.textView2);
        t2 = findViewById(R.id.textView2);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);

        g1 = findViewById(R.id.button);

        b4 = findViewById(R.id.w0); }

        c1.setEnabled(false);
        c2.setEnabled(false);
        c3.setEnabled(false);
        c4.setEnabled(false);
        c5.setEnabled(false);
        c6.setEnabled(false);

        c1.setOnClickListener(oс);
        c2.setOnClickListener(oс);
        c3.setOnClickListener(oс);
        c4.setOnClickListener(oс);
        c5.setOnClickListener(oс);
        c6.setOnClickListener(oс);

    }

     String[] r = {"красный","оранжевый","желтый","зеленый","синий","фиолетовый"};

    View.OnClickListener oс = new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.N)
        public void onClick(View view) {

            // узнаем какое слово было выведено на экран
            int index = (Arrays.asList(r).indexOf(t1.getText())) + 1;

            Button btn = findViewById(view.getId());

            if (String.valueOf(index) != btn.getText()){
                t2.setText("НЕПРАВИЛЬНО");
                t2.setTextColor(getResources().getColor(R.color.red));

            }

            // если слово на экране соответствует тексту на нажатой кнопке...
            if (String.valueOf(index).contentEquals(btn.getText())) {
                // выборка нового слово
                randomSelectWord();
                t2.setText("ПРАВИЛЬНО");
                t2.setTextColor(getResources().getColor(R.color.green));
            }
        }
    };

    private void randomSelectWord() {
        t1.setText(r[(int) (Math.random() * r.length)]);
    }

    /**
     * в методе clickNumbers() реализован рандом без повторений (Random shuffle)
     * новые рандомные значения передаем кнопкам
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void setRandomShuffleValueButton() {
        Random random = new Random();
        List<Object> randomNumbers = random.ints(1, 10)
                .distinct().limit(9).boxed().collect(Collectors.toList());

        c1.setText(String.valueOf(randomNumbers.get(0)));
        c2.setText(String.valueOf(randomNumbers.get(1)));
        c3.setText(String.valueOf(randomNumbers.get(2)));
        c4.setText(String.valueOf(randomNumbers.get(3)));
        c5.setText(String.valueOf(randomNumbers.get(4)));
        c6.setText(String.valueOf(randomNumbers.get(5)));
    }

    public void back(View view) {
        Intent a = new Intent(ma3.this , MainActivity.class);
        startActivity(a);
        finish();
    }

    public void game(View view) {
        c1.setEnabled(true);
        c2.setEnabled(true);
        c3.setEnabled(true);
        c4.setEnabled(true);
        c5.setEnabled(true);
        c6.setEnabled(true);

        c1.setBackgroundColor(getResources().getColor(R.color.red));
        c2.setBackgroundColor(getResources().getColor(R.color.orange));
        c3.setBackgroundColor(getResources().getColor(R.color.yellow));
        c4.setBackgroundColor(getResources().getColor(R.color.green));
        c5.setBackgroundColor(getResources().getColor(R.color.blue));
        c6.setBackgroundColor(getResources().getColor(R.color.purple));

        c1.setTextColor(getResources().getColor(R.color.red));
        c2.setTextColor(getResources().getColor(R.color.orange));
        c3.setTextColor(getResources().getColor(R.color.yellow));
        c4.setTextColor(getResources().getColor(R.color.green));
        c5.setTextColor(getResources().getColor(R.color.blue));
        c6.setTextColor(getResources().getColor(R.color.purple));

          randomSelectWord();
    }
}
