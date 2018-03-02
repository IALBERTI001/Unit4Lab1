package com.example.ivan.unit4lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TOTAL_COUNT = "total_count";
    Integer count;
    String counterString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Toast button Handler
     * @param view
     */
    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Hello, Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    /**
     * update counter text
     * @param view
     */
    public void countMe(View view){
        //calls on counter text
        TextView showCountTextView = (TextView) findViewById(R.id.counter);

        //get current value
        counterString = showCountTextView.getText().toString();

        //convert value into number
        count = Integer.parseInt(counterString);

        //add one to value
        count++;

        //put text back on string
        showCountTextView.setText(count.toString());
    }

    /**
     * second activity being started
     * @param view
     */

    public void randomMe(View view){
        //create an intent to start the second activity
        Intent randomIntent = new Intent(this, secondActivity.class);

        //add counter information onto the next activity
        randomIntent.putExtra(TOTAL_COUNT, count);

        //start the new activity
        startActivity(randomIntent);

    }


}
