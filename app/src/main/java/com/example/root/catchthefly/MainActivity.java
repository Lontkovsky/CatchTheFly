package com.example.root.catchthefly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.R.attr.button;
import static com.example.root.catchthefly.R.id.score;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    int score = 10;

    public void tap(View v) {



        TextView score = (TextView) findViewById(R.id.score);

        ImageView fly = (ImageView) findViewById(R.id.fly);
        RelativeLayout game = (RelativeLayout) findViewById(R.id.game);

        int width = game.getWidth();
        int height = game.getHeight();

        Random random = new Random();

        int x = width;
        int y = height;

        int imageX = random.nextInt(x);
        int imageY = random.nextInt(y);

        fly.setX(imageX-64);
        fly.setY(imageY-64);

        decrement(score);


    }

    public void decrement(View v){
        if (score == 0){

            Intent intent = new Intent(MainActivity.this, RegActivity.class);
            startActivity(intent);
        }
        else score --;
        displayScore(score);
    }

    public void displayScore (int score){
        TextView count = (TextView) findViewById(R.id.score);
        count.setText("" + score);

    }

}
