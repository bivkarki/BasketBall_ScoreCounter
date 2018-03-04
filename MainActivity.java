package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threepointsA(View view) {
        scoreA += 3;
        displayA(scoreA);
    }

    public void twopointsA(View view) {
        scoreA += 2;
        displayA(scoreA);
    }

    public void onepointA(View view) {
        scoreA += 1;
        displayA(scoreA);
    }

    public void threepointsB(View view) {
        scoreB += 3;
        displayB(scoreB);
    }

    public void twopointsB(View view) {
        scoreB += 2;
        displayB(scoreB);
    }

    public void onepointB(View view) {
        scoreB += 1;
        displayB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayB(scoreB);
        displayA(scoreA);
        TextView result = (TextView) findViewById(R.id.result_tv);
        result.setText("");


    }

    public void displayA(int scoreA) {
        TextView ScoreTV = (TextView) findViewById(R.id.score_tv1);
        ScoreTV.setText("" + scoreA);
            }

    public void displayB(int scoreB) {
        TextView ScoreTV = (TextView) findViewById(R.id.score_tv2);
        ScoreTV.setText("" + scoreB);
           }

    public void result(View view) {
  int a= scoreA-scoreB;
        int b= scoreB-scoreA;
        TextView result = (TextView) findViewById(R.id.result_tv);
        if(scoreA > scoreB)
        result.setText("Team A is leading by "+a+" points" );
        else if(scoreA<scoreB)
        result.setText("Team B is leading by "+b+" points");
        else
        result.setText("Both team are having same points" );
    }
}


/*<Button
    android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Reset"
            andoroid:layout_gravity="center_horizontal"
            android:onClick="reset"/> */