package com.example.vilimirita;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartGame3 extends AppCompatActivity {

    TextView tvInsert;
    TextView answer;

    Button rock;
    Button paper;
    Button scissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_3);

        tvInsert = findViewById(R.id.bot);
        answer = findViewById(R.id.TextView2);

        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scissors);

        rock.setOnClickListener(onClick);
        paper.setOnClickListener(onClick);
        scissors.setOnClickListener(onClick);

    }
    String random[] = {"\uD83D\uDC4A","✌","\uD83D\uDD90"};
    public void random(TextView b) {
        int a =(int)(0 + Math.random() * 3);
        b.setText(random[a]);
    }

    public void timer(Button button, TextView monitor, TextView answer, int btnAnswer,int tvAnswer ){
        new CountDownTimer(1000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
              //  answer.setText("таймер: " + millisUntilFinished / 1000);
                paper.setEnabled(false);
                scissors.setEnabled(false);
                rock.setEnabled(false);
            }
            @Override
            public void onFinish() {
                if(button.getText().equals(monitor.getText())){
                    answer.setText("ничья");
                }
                else if(button.getText().equals(random[btnAnswer]) && monitor.getText().equals(random[tvAnswer]) ){
                    answer.setText("победа");
                }
                else{
                    answer.setText("проиграл");
                }
                paper.setEnabled(true);
                scissors.setEnabled(true);
                rock.setEnabled(true);
            }
        }.start();
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.rock:
                    random(tvInsert);
                    timer(rock, tvInsert, answer, 0, 1);
                    break;
                case R.id.paper:
                    random(tvInsert);
                    timer(paper, tvInsert, answer, 1, 2);
                    break;
                case R.id.scissors:
                    random(tvInsert);
                    timer(scissors, tvInsert, answer, 2, 0);
                    break;
            }
        }
    };

    public void back(View view) {
        Intent a = new Intent(StartGame3.this, MainActivity.class);
        startActivity(a);
        finish();

    }
}
