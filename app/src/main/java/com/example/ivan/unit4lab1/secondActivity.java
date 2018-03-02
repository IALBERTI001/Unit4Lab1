package com.example.ivan.unit4lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class secondActivity extends AppCompatActivity {
    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    public void showRandomNumber(){
        //get the textview for counter
        TextView randomView = (TextView) findViewById(R.id.counterText);

        //textview of the header
        TextView headingView = (TextView) findViewById(R.id.infoText);

        //get the count from intent extras
        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        //generate the random numnber
        Random random = new Random();
        int randomInt = 0;
        if(count>0){
            randomInt = random.nextInt(count);
        }

        //display random number
        randomView.setText(Integer.toString(randomInt));

        //substitute the max value into resource for the heading
        headingView.setText(getString(R.string.random_heading, count));


    }
}
