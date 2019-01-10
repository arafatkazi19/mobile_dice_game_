package com.example.asus.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressbutton;
        pressbutton = findViewById(R.id.tx_but);

        final ImageView dice_two = findViewById(R.id.two);
        final ImageView dice_one = findViewById(R.id.one);

       final   int[] diceArray = {
                R.drawable.dice_1,
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_6
        };

        pressbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.d("DiceGame" , "Button has been pressed");

                 Random randomNumberGenerator = new Random();

                 int number = randomNumberGenerator.nextInt(6);

                 Log.d("DiceGame" , "The random number is: " +number);

                 dice_two.setImageResource(diceArray[number]);

                 number = randomNumberGenerator.nextInt(6);

                 dice_one.setImageResource(diceArray[number]);
             }
         });



    }
}
